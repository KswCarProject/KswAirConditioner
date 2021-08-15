package com.wits.ksw.airc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
@BindingMethods({@BindingMethod(attribute = "setImageLevel", method = "setImageLevel", type = ImageView.class)})
public class ImageViewLevel extends ImageView {
    private static final String TAG = ImageViewLevel.class.getName();

    public ImageViewLevel(Context context) {
        this(context, (AttributeSet) null);
    }

    public ImageViewLevel(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void setImageLevel(int level) {
        super.setImageLevel(level);
        String str = TAG;
        Log.i(str, "setImageLevel: " + level);
    }
}
