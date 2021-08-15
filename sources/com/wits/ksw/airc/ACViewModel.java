package com.wits.ksw.airc;

import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.util.Log;
import android.view.View;
import com.wits.pms.statuscontrol.McuStatus;

public class ACViewModel extends ViewModel {
    protected static final String TAG = ACViewModel.class.getSimpleName();
    protected Context context;

    public void dual(View view) {
        Log.d(TAG, " dual ");
        McuStatus.AirControl.pressKey(McuStatus.AirControl.AcKeyType.dual);
    }

    public void leftTmpAdd(View view) {
        Log.d(TAG, " leftTmpAdd ");
        McuStatus.AirControl.pressKey(McuStatus.AirControl.AcKeyType.leftTmpAdd);
    }

    public void leftTmpReduce(View view) {
        Log.d(TAG, " leftTmpReduce ");
        McuStatus.AirControl.pressKey(McuStatus.AirControl.AcKeyType.leftTmpReduce);
    }

    public void rightTmpAdd(View view) {
        Log.d(TAG, " rightTmpAdd ");
        McuStatus.AirControl.pressKey(McuStatus.AirControl.AcKeyType.rightTmpAdd);
    }

    public void rightTmpReduce(View view) {
        Log.d(TAG, " rightTmpReduce ");
        McuStatus.AirControl.pressKey(McuStatus.AirControl.AcKeyType.rightTmpReduce);
    }

    public void speedAdd(View view) {
        Log.d(TAG, " speedAdd ");
        McuStatus.AirControl.pressKey(McuStatus.AirControl.AcKeyType.speedAdd);
    }

    public void speedReduce(View view) {
        Log.d(TAG, " speedReduce ");
        McuStatus.AirControl.pressKey(McuStatus.AirControl.AcKeyType.speedReduce);
    }

    public void ac(View view) {
        Log.d(TAG, " ac ");
        McuStatus.AirControl.pressKey(McuStatus.AirControl.AcKeyType.AC_Switch);
    }

    public void autoSwitch(View view) {
        Log.d(TAG, " autoSwitch ");
        McuStatus.AirControl.pressKey(McuStatus.AirControl.AcKeyType.autoSwitch);
    }

    public void frontMistSwitch(View view) {
        Log.d(TAG, " frontMistSwitch ");
        McuStatus.AirControl.pressKey(McuStatus.AirControl.AcKeyType.frontMistSwitch);
    }

    public void backMistSwitch(View view) {
        Log.d(TAG, " backMistSwitch ");
        McuStatus.AirControl.pressKey(McuStatus.AirControl.AcKeyType.backMistSwitch);
    }

    public void loop(View view) {
        Log.d(TAG, " loop ");
        McuStatus.AirControl.pressKey(McuStatus.AirControl.AcKeyType.loop);
    }
}
