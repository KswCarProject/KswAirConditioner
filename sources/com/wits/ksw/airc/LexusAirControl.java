package com.wits.ksw.airc;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.wits.ksw.airc.databinding.LexusAircShowViewBinding;
import com.wits.pms.IContentObserver;
import com.wits.pms.statuscontrol.McuStatus;
import com.wits.pms.statuscontrol.PowerManagerApp;
import com.wits.pms.statuscontrol.WitsCommand;

public class LexusAirControl extends AppCompatActivity {
    public static final String TAG = LexusAirControl.class.getSimpleName();
    private ACViewModel acViewModel;
    LexusAircShowViewBinding lexusAirBind = null;
    private int tempUnit = 0;
    private LexusUiParams uiParams = new LexusUiParams();

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.lexusAirBind = (LexusAircShowViewBinding) DataBindingUtil.setContentView(this, R.layout.lexus_airc_show_view);
        this.acViewModel = (ACViewModel) ViewModelProviders.of((FragmentActivity) this).get(ACViewModel.class);
        this.lexusAirBind.setViewModel(this.acViewModel);
        this.lexusAirBind.setMUiParams(this.uiParams);
        setFull();
        registerIContentObserver();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        WitsCommand.sendCommand(1, WitsCommand.SystemCommand.AIR_DATA_REQ);
        try {
            McuStatus.ACData acData = McuStatus.ACData.getStatusFromJson(PowerManagerApp.getStatusString("acData"));
            String str = TAG;
            Log.i(str, "onResume: acData=" + acData.getJson());
            update(acData);
        } catch (Exception e) {
        }
    }

    public void setFull() {
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().addFlags(67108864);
            getWindow().addFlags(134217728);
        }
    }

    private void registerIContentObserver() {
        Log.i(TAG, "onCreate: registerIContentObserver");
        PowerManagerApp.registerIContentObserver("acData", new IContentObserver.Stub() {
            public void onChange() throws RemoteException {
                try {
                    McuStatus.ACData acData = McuStatus.ACData.getStatusFromJson(PowerManagerApp.getStatusString("acData"));
                    String str = LexusAirControl.TAG;
                    Log.i(str, "onChange: acData=" + acData.getJson());
                    LexusAirControl.this.update(acData);
                } catch (Exception e) {
                    e.printStackTrace();
                    String str2 = LexusAirControl.TAG;
                    Log.e(str2, "onChange: Exception " + e.getMessage());
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void update(McuStatus.ACData acData) {
        this.uiParams.setOpen(acData.isOpen);
        this.uiParams.setAutoSwitch(acData.autoSwitch);
        this.uiParams.setLoopMode(acData.loop);
        this.uiParams.setACStatus(acData.AC_Switch);
        this.uiParams.setBackMistSwitch(acData.backMistSwitch);
        this.uiParams.setFrontMistSwitch(acData.frontMistSwitch);
        this.uiParams.setWindSpeed((int) acData.speed);
        this.uiParams.setDual(acData.sync);
        try {
            this.tempUnit = PowerManagerApp.getSettingsInt(AircService.TempUnit);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if (acData.leftTmp == 0.0f) {
            this.uiParams.setLeftTempStr("LO");
        } else if (acData.leftTmp == -1.0f) {
            this.uiParams.setLeftTempStr("HI");
        } else if (this.tempUnit == 1) {
            int tempToF = tempToF(acData.leftTmp);
            LexusUiParams lexusUiParams = this.uiParams;
            lexusUiParams.setLeftTempStr(String.valueOf(tempToF) + "°F");
        } else {
            LexusUiParams lexusUiParams2 = this.uiParams;
            lexusUiParams2.setLeftTempStr(String.valueOf(acData.leftTmp) + "℃");
        }
        if (acData.rightTmp == 0.0f) {
            this.uiParams.setRightTempStr("LO");
        } else if (acData.rightTmp == -1.0f) {
            this.uiParams.setRightTempStr("HI");
        } else if (this.tempUnit == 1) {
            int tempToF2 = tempToF(acData.rightTmp);
            LexusUiParams lexusUiParams3 = this.uiParams;
            lexusUiParams3.setRightTempStr(String.valueOf(tempToF2) + "°F");
        } else {
            LexusUiParams lexusUiParams4 = this.uiParams;
            lexusUiParams4.setRightTempStr(String.valueOf(acData.rightTmp) + "℃");
        }
        this.uiParams.setLoopMode(acData.loop);
        boolean above = acData.isOpen(8);
        boolean front = acData.isOpen(4);
        boolean below = acData.isOpen(2);
        if (!above && !front && !below) {
            this.uiParams.setBlowingMode(0);
        } else if (!above && front && !below) {
            this.uiParams.setBlowingMode(1);
        } else if (!above && !front && below) {
            this.uiParams.setBlowingMode(2);
        } else if (above && !front && below) {
            this.uiParams.setBlowingMode(3);
        } else if (!above && front && below) {
            this.uiParams.setBlowingMode(4);
        } else if (above) {
        }
        String str = TAG;
        Log.d(str, "blowing mode right_above " + above + " right_front " + front + " right_below " + below);
    }

    public static int tempToF(float tmep) {
        return Math.round(((9.0f * tmep) / 5.0f) + 32.0f);
    }
}
