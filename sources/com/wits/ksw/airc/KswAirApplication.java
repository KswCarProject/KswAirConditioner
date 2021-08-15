package com.wits.ksw.airc;

import android.app.Application;
import com.wits.pms.statuscontrol.PowerManagerApp;

public class KswAirApplication extends Application {
    public void onCreate() {
        super.onCreate();
        PowerManagerApp.init(this);
    }
}
