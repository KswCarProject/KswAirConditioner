package com.wits.ksw.airc;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

public class UiParams {
    public final ObservableInt acStatus = new ObservableInt();
    public final ObservableBoolean autoSwitch = new ObservableBoolean();
    public final ObservableBoolean frontMistSwitch = new ObservableBoolean();
    public final ObservableBoolean isOpen = new ObservableBoolean();
    public final ObservableInt leftBlowingMode = new ObservableInt();
    public final ObservableField<String> leftTempStr = new ObservableField<>();
    public final ObservableInt loopMode = new ObservableInt();
    public final ObservableInt max = new ObservableInt();
    public final ObservableInt rear = new ObservableInt();
    public final ObservableInt rightBlowingMode = new ObservableInt();
    public final ObservableField<String> rightTempStr = new ObservableField<>();
    public final ObservableInt windSpeed = new ObservableInt();

    public void setOpen(boolean isOpen2) {
        this.isOpen.set(isOpen2);
    }

    public void setMax(int value) {
        this.max.set(value);
    }

    public void setRear(int value) {
        this.rear.set(value);
    }

    public void setLoopMode(int value) {
        if (value > 7) {
            value = 7;
        }
        this.loopMode.set(value);
    }

    public void setFrontMistSwitch(boolean frontMistSwitch2) {
        this.frontMistSwitch.set(frontMistSwitch2);
    }

    public void setAutoSwitch(boolean autoSwitch2) {
        this.autoSwitch.set(autoSwitch2);
    }

    public void setACStatus(int value) {
        this.acStatus.set(value);
    }

    public void setWindSpeed(int value) {
        this.windSpeed.set(value);
    }

    public void setRightBlowingMode(int value) {
        this.rightBlowingMode.set(value);
    }

    public void setLeftBlowingMode(int value) {
        this.leftBlowingMode.set(value);
    }

    public void setRightTempStr(String value) {
        this.rightTempStr.set(value);
    }

    public void setLeftTempStr(String value) {
        this.leftTempStr.set(value);
    }
}
