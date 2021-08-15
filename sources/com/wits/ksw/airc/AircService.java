package com.wits.ksw.airc;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import com.wits.pms.IContentObserver;
import com.wits.pms.statuscontrol.McuStatus;
import com.wits.pms.statuscontrol.PowerManagerApp;

public class AircService extends Service {
    public static final String AirConditioner = "air_conditioner";
    public static final String CarManufacturer = "car_manufacturer";
    private static final int DELAYMILLIS = 5000;
    private static final String TAG = "KSWKT";
    public static final String TempUnit = "TempUnit";
    private static final int WHAT = 2457;
    private View airCview;
    private int air_conditioner;
    private String[] blowingMode = {"00000000", "00001010", "00000010", "00001000", "00000001", "00000100", "00001110", "00000110", "00001100"};
    private int car_manufacturer = 0;
    /* access modifiers changed from: private */
    public Handler handler = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == AircService.WHAT) {
                AircService.this.addAirCView();
                postDelayed(new Runnable() {
                    public void run() {
                        AircService.this.removeAirCView();
                    }
                }, 5000);
            }
        }
    };
    private boolean isVisiblity;
    private int tempUnit = 0;
    private UiParams uiParams = new UiParams();
    private WindowManager windowManager;

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.windowManager = (WindowManager) getSystemService("window");
        Log.i(TAG, "onCreate: 空调服务已启动");
        registerIContentObserver();
    }

    private void registerIContentObserver() {
        Log.i(TAG, "onCreate: registerIContentObserver");
        PowerManagerApp.registerIContentObserver("acData", new IContentObserver.Stub() {
            public void onChange() throws RemoteException {
                try {
                    McuStatus.ACData acData = McuStatus.ACData.getStatusFromJson(PowerManagerApp.getStatusString("acData"));
                    Log.i(AircService.TAG, "onChange: acData=" + acData.getJson());
                    AircService.this.updata(acData);
                    AircService.this.handler.removeCallbacksAndMessages((Object) null);
                    AircService.this.handler.obtainMessage(AircService.WHAT).sendToTarget();
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e(AircService.TAG, "onChange: Exception " + e.getMessage());
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void updata(McuStatus.ACData acData) {
        this.uiParams.setOpen(acData.isOpen);
        this.uiParams.setAutoSwitch(acData.autoSwitch);
        this.uiParams.setLoopMode(acData.loop);
        this.uiParams.setACStatus(acData.AC_Switch ? 1 : 0);
        this.uiParams.setRear(acData.backMistSwitch ? 1 : 0);
        this.uiParams.setMax(acData.frontMistSwitch ? 1 : 0);
        this.uiParams.setWindSpeed((int) acData.speed);
        try {
            this.tempUnit = PowerManagerApp.getSettingsInt(TempUnit);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if (acData.leftTmp == 0.0f) {
            this.uiParams.setLeftTempStr("LO");
        } else if (acData.leftTmp == -1.0f) {
            this.uiParams.setLeftTempStr("HI");
        } else if (this.tempUnit == 1) {
            int tempToF = tempToF(acData.leftTmp);
            this.uiParams.setLeftTempStr(String.valueOf(tempToF) + "°F");
        } else {
            this.uiParams.setLeftTempStr(String.valueOf(acData.leftTmp) + "℃");
        }
        if (acData.rightTmp == 0.0f) {
            this.uiParams.setRightTempStr("LO");
        } else if (acData.rightTmp == -1.0f) {
            this.uiParams.setRightTempStr("HI");
        } else if (this.tempUnit == 1) {
            int tempToF2 = tempToF(acData.rightTmp);
            this.uiParams.setRightTempStr(String.valueOf(tempToF2) + "°F");
        } else {
            this.uiParams.setRightTempStr(String.valueOf(acData.rightTmp) + "℃");
        }
        this.uiParams.setLoopMode(acData.loop);
        this.uiParams.setFrontMistSwitch(acData.frontMistSwitch);
        String toBinaryString = McuStatus.ACData.getModeBinaryString(acData.mode);
        Log.i(TAG, "updata: toBinaryString= " + toBinaryString);
        StringBuilder sb = new StringBuilder();
        sb.append("0000");
        sb.append(toBinaryString.substring(0, 4));
        String highFourBinary = sb.toString();
        Log.i(TAG, "updata: highFourBinary= " + highFourBinary);
        if (TextUtils.equals(highFourBinary, "00001111")) {
            highFourBinary = "00000001";
        }
        String lowFourBinary = "0000" + toBinaryString.substring(4, 8);
        Log.i(TAG, "updata: lowFourBinary= " + lowFourBinary);
        if (TextUtils.equals(lowFourBinary, "00001111")) {
            lowFourBinary = "00000001";
        }
        int length = this.blowingMode.length;
        for (int index = 0; index < length; index++) {
            if (this.blowingMode[index].equals(highFourBinary)) {
                this.uiParams.setLeftBlowingMode(index);
                Log.i(TAG, "updata: setLeftBlowingMode=" + index);
            }
            if (this.blowingMode[index].equals(lowFourBinary)) {
                this.uiParams.setRightBlowingMode(index);
                Log.i(TAG, "updata: setRightBlowingMode=" + index);
            }
        }
        boolean leftAuto = acData.isOpen(16);
        boolean rightAuto = acData.isOpen(1);
        if (leftAuto) {
            this.uiParams.setLeftBlowingMode(4);
        }
        if (rightAuto) {
            this.uiParams.setRightBlowingMode(4);
        }
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onStartCommand: " + intent);
        Log.i(TAG, "onStartCommand: flags=" + flags);
        Log.i(TAG, "onStartCommand: startId=" + startId);
        return 1;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 空调服务已断开");
        removeAirCView();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051 A[Catch:{ Exception -> 0x00ca }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052 A[Catch:{ Exception -> 0x00ca }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addAirCView() {
        /*
            r7 = this;
            boolean r0 = r7.isVisiblity     // Catch:{ Exception -> 0x00ca }
            if (r0 != 0) goto L_0x00c9
            android.content.ContentResolver r0 = r7.getContentResolver()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r1 = "car_manufacturer"
            r2 = 0
            int r0 = android.provider.Settings.System.getInt(r0, r1, r2)     // Catch:{ Exception -> 0x00ca }
            r7.car_manufacturer = r0     // Catch:{ Exception -> 0x00ca }
            int r0 = r7.car_manufacturer     // Catch:{ Exception -> 0x00ca }
            r1 = 3
            r3 = 1
            if (r0 == r1) goto L_0x0029
            int r0 = r7.car_manufacturer     // Catch:{ Exception -> 0x00ca }
            if (r0 != r3) goto L_0x001c
            goto L_0x0029
        L_0x001c:
            android.content.ContentResolver r0 = r7.getContentResolver()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r1 = "air_conditioner"
            int r0 = android.provider.Settings.System.getInt(r0, r1, r3)     // Catch:{ Exception -> 0x00ca }
            r7.air_conditioner = r0     // Catch:{ Exception -> 0x00ca }
            goto L_0x002b
        L_0x0029:
            r7.air_conditioner = r2     // Catch:{ Exception -> 0x00ca }
        L_0x002b:
            java.lang.String r0 = "KSWKT"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ca }
            r1.<init>()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r4 = " car_manufacturer: "
            r1.append(r4)     // Catch:{ Exception -> 0x00ca }
            int r4 = r7.car_manufacturer     // Catch:{ Exception -> 0x00ca }
            r1.append(r4)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r4 = " air_conditioner: "
            r1.append(r4)     // Catch:{ Exception -> 0x00ca }
            int r4 = r7.air_conditioner     // Catch:{ Exception -> 0x00ca }
            r1.append(r4)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ca }
            android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x00ca }
            int r0 = r7.air_conditioner     // Catch:{ Exception -> 0x00ca }
            if (r0 != 0) goto L_0x0052
            return
        L_0x0052:
            int r0 = r7.car_manufacturer     // Catch:{ Exception -> 0x00ca }
            r1 = 4
            if (r0 != r1) goto L_0x0066
            java.lang.String r0 = "topApp"
            java.lang.String r0 = com.wits.pms.statuscontrol.PowerManagerApp.getStatusString(r0)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r1 = "com.wits.ksw.airc"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x00ca }
            if (r0 == 0) goto L_0x0066
            return
        L_0x0066:
            r0 = 0
            r1 = 0
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r7)     // Catch:{ Exception -> 0x00ca }
            r5 = 2131296284(0x7f09001c, float:1.821048E38)
            r6 = 0
            android.databinding.ViewDataBinding r2 = android.databinding.DataBindingUtil.inflate(r4, r5, r6, r2)     // Catch:{ Exception -> 0x00ca }
            com.wits.ksw.airc.databinding.AircShowViewBinding r2 = (com.wits.ksw.airc.databinding.AircShowViewBinding) r2     // Catch:{ Exception -> 0x00ca }
            r0 = r2
            com.wits.ksw.airc.UiParams r2 = r7.uiParams     // Catch:{ Exception -> 0x00ca }
            r0.setMUiParams(r2)     // Catch:{ Exception -> 0x00ca }
            android.view.WindowManager$LayoutParams r2 = new android.view.WindowManager$LayoutParams     // Catch:{ Exception -> 0x00ca }
            r2.<init>()     // Catch:{ Exception -> 0x00ca }
            r4 = 2039(0x7f7, float:2.857E-42)
            r2.type = r4     // Catch:{ Exception -> 0x00ca }
            r4 = 8
            r2.flags = r4     // Catch:{ Exception -> 0x00ca }
            if (r1 != 0) goto L_0x00a0
            r4 = 1112014848(0x42480000, float:50.0)
            int r4 = com.wits.ksw.airc.DisplayUtils.dip2px(r7, r4)     // Catch:{ Exception -> 0x00ca }
            r2.height = r4     // Catch:{ Exception -> 0x00ca }
            r4 = 1060320051(0x3f333333, float:0.7)
            r2.alpha = r4     // Catch:{ Exception -> 0x00ca }
            r4 = -2
            r2.format = r4     // Catch:{ Exception -> 0x00ca }
            r4 = 80
            r2.gravity = r4     // Catch:{ Exception -> 0x00ca }
            goto L_0x00a5
        L_0x00a0:
            r4 = -1
            r2.width = r4     // Catch:{ Exception -> 0x00ca }
            r2.height = r4     // Catch:{ Exception -> 0x00ca }
        L_0x00a5:
            r4 = 2131493035(0x7f0c00ab, float:1.8609539E38)
            r2.windowAnimations = r4     // Catch:{ Exception -> 0x00ca }
            if (r1 == 0) goto L_0x00b3
            android.view.View r4 = r1.getRoot()     // Catch:{ Exception -> 0x00ca }
            r7.airCview = r4     // Catch:{ Exception -> 0x00ca }
            goto L_0x00b9
        L_0x00b3:
            android.view.View r4 = r0.getRoot()     // Catch:{ Exception -> 0x00ca }
            r7.airCview = r4     // Catch:{ Exception -> 0x00ca }
        L_0x00b9:
            android.view.WindowManager r4 = r7.windowManager     // Catch:{ Exception -> 0x00ca }
            android.view.View r5 = r7.airCview     // Catch:{ Exception -> 0x00ca }
            r4.addView(r5, r2)     // Catch:{ Exception -> 0x00ca }
            r7.isVisiblity = r3     // Catch:{ Exception -> 0x00ca }
            java.lang.String r3 = "KSWKT"
            java.lang.String r4 = "showAirCView: "
            android.util.Log.i(r3, r4)     // Catch:{ Exception -> 0x00ca }
        L_0x00c9:
            goto L_0x00ce
        L_0x00ca:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wits.ksw.airc.AircService.addAirCView():void");
    }

    /* access modifiers changed from: private */
    public void removeAirCView() {
        try {
            if (this.airCview == null || this.windowManager == null) {
                Log.i(TAG, "removeAirCView: filed null");
                return;
            }
            this.windowManager.removeView(this.airCview);
            this.isVisiblity = false;
            Log.i(TAG, "removeAirCView: ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int tempToF(float tmep) {
        return Math.round(((9.0f * tmep) / 5.0f) + 32.0f);
    }
}
