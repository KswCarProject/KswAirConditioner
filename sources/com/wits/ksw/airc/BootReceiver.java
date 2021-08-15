package com.wits.ksw.airc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {
    private static final String TAG = "空调";

    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent("com.wits.ksw.intent.action.AIR_CONDITIONER_CHANGE");
        intent1.setClassName(BuildConfig.APPLICATION_ID, "com.wits.ksw.airc.AircService");
        context.startService(intent1);
    }
}
