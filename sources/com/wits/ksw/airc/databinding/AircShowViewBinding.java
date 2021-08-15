package com.wits.ksw.airc.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.wits.ksw.airc.ImageViewLevel;
import com.wits.ksw.airc.R;
import com.wits.ksw.airc.UiParams;

public abstract class AircShowViewBinding extends ViewDataBinding {
    @NonNull
    public final ImageViewLevel leftTempImage;
    @NonNull
    public final TextView leftTempTextView;
    @Bindable
    protected UiParams mMUiParams;
    @NonNull
    public final TextView textView;
    @NonNull
    public final ImageView textView2;
    @NonNull
    public final ImageView textView4;
    @NonNull
    public final ImageView textView5;
    @NonNull
    public final ImageViewLevel textView6;
    @NonNull
    public final ImageView textView7;
    @NonNull
    public final TextView textView8;
    @NonNull
    public final ImageView windSpeedImageView;
    @NonNull
    public final TextView windSpeedTextView;

    public abstract void setMUiParams(@Nullable UiParams uiParams);

    protected AircShowViewBinding(DataBindingComponent _bindingComponent, View _root, int _localFieldCount, ImageViewLevel leftTempImage2, TextView leftTempTextView2, TextView textView3, ImageView textView22, ImageView textView42, ImageView textView52, ImageViewLevel textView62, ImageView textView72, TextView textView82, ImageView windSpeedImageView2, TextView windSpeedTextView2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.leftTempImage = leftTempImage2;
        this.leftTempTextView = leftTempTextView2;
        this.textView = textView3;
        this.textView2 = textView22;
        this.textView4 = textView42;
        this.textView5 = textView52;
        this.textView6 = textView62;
        this.textView7 = textView72;
        this.textView8 = textView82;
        this.windSpeedImageView = windSpeedImageView2;
        this.windSpeedTextView = windSpeedTextView2;
    }

    @Nullable
    public UiParams getMUiParams() {
        return this.mMUiParams;
    }

    @NonNull
    public static AircShowViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static AircShowViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
        return (AircShowViewBinding) DataBindingUtil.inflate(inflater, R.layout.airc_show_view, root, attachToRoot, component);
    }

    @NonNull
    public static AircShowViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static AircShowViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable DataBindingComponent component) {
        return (AircShowViewBinding) DataBindingUtil.inflate(inflater, R.layout.airc_show_view, (ViewGroup) null, false, component);
    }

    public static AircShowViewBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    public static AircShowViewBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
        return (AircShowViewBinding) bind(component, view, R.layout.airc_show_view);
    }
}
