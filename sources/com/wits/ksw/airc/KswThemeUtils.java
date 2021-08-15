package com.wits.ksw.airc;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;

public class KswThemeUtils {
    public static final String Benz_MBUX = "Benz_MBUX";
    public static final String Benz_NTG6 = "Benz_NTG6";

    private static boolean isBenz_NTG6(Context context) {
        return TextUtils.equals(getUiName(context), Benz_NTG6);
    }

    private static boolean isBenz_MBUX(Context context) {
        return TextUtils.equals(getUiName(context), Benz_MBUX);
    }

    public static boolean isBenz(Context context) {
        return isBenz_NTG6(context) || isBenz_MBUX(context);
    }

    public static String getUiName(Context context) {
        return Settings.System.getString(context.getContentResolver(), "UiName");
    }
}
