package com.wits.ksw.airc;

import android.content.Context;

public class DisplayUtils {
    public static int dip2px(Context context, float dpValue) {
        return (int) ((dpValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
