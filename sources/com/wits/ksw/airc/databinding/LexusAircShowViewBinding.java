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
import com.wits.ksw.airc.ACViewModel;
import com.wits.ksw.airc.ImageViewLevel;
import com.wits.ksw.airc.LexusUiParams;
import com.wits.ksw.airc.R;

public abstract class LexusAircShowViewBinding extends ViewDataBinding {
    @NonNull
    public final ImageView leftTempAdd;
    @NonNull
    public final ImageView leftTempSub;
    @NonNull
    public final TextView leftTempTextView;
    @Bindable
    protected LexusUiParams mMUiParams;
    @Bindable
    protected ACViewModel mViewModel;
    @NonNull
    public final ImageView rightAc;
    @NonNull
    public final ImageView rightAuto;
    @NonNull
    public final ImageView rightBackMist;
    @NonNull
    public final ImageView rightDual;
    @NonNull
    public final ImageView rightFrontMist;
    @NonNull
    public final ImageView rightLoop;
    @NonNull
    public final ImageView rightTempAdd;
    @NonNull
    public final ImageView rightTempSub;
    @NonNull
    public final TextView rightTempTextView;
    @NonNull
    public final ImageViewLevel textView6;
    @NonNull
    public final ImageView windSpeedAdd;
    @NonNull
    public final ImageViewLevel windSpeedImageView;
    @NonNull
    public final ImageView windSpeedSub;
    @NonNull
    public final TextView windSpeedTextView;

    public abstract void setMUiParams(@Nullable LexusUiParams lexusUiParams);

    public abstract void setViewModel(@Nullable ACViewModel aCViewModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected LexusAircShowViewBinding(DataBindingComponent _bindingComponent, View _root, int _localFieldCount, ImageView leftTempAdd2, ImageView leftTempSub2, TextView leftTempTextView2, ImageView rightAc2, ImageView rightAuto2, ImageView rightBackMist2, ImageView rightDual2, ImageView rightFrontMist2, ImageView rightLoop2, ImageView rightTempAdd2, ImageView rightTempSub2, TextView rightTempTextView2, ImageViewLevel textView62, ImageView windSpeedAdd2, ImageViewLevel windSpeedImageView2, ImageView windSpeedSub2, TextView windSpeedTextView2) {
        super(_bindingComponent, _root, _localFieldCount);
        this.leftTempAdd = leftTempAdd2;
        this.leftTempSub = leftTempSub2;
        this.leftTempTextView = leftTempTextView2;
        this.rightAc = rightAc2;
        this.rightAuto = rightAuto2;
        this.rightBackMist = rightBackMist2;
        this.rightDual = rightDual2;
        this.rightFrontMist = rightFrontMist2;
        this.rightLoop = rightLoop2;
        this.rightTempAdd = rightTempAdd2;
        this.rightTempSub = rightTempSub2;
        this.rightTempTextView = rightTempTextView2;
        this.textView6 = textView62;
        this.windSpeedAdd = windSpeedAdd2;
        this.windSpeedImageView = windSpeedImageView2;
        this.windSpeedSub = windSpeedSub2;
        this.windSpeedTextView = windSpeedTextView2;
    }

    @Nullable
    public ACViewModel getViewModel() {
        return this.mViewModel;
    }

    @Nullable
    public LexusUiParams getMUiParams() {
        return this.mMUiParams;
    }

    @NonNull
    public static LexusAircShowViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LexusAircShowViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
        return (LexusAircShowViewBinding) DataBindingUtil.inflate(inflater, R.layout.lexus_airc_show_view, root, attachToRoot, component);
    }

    @NonNull
    public static LexusAircShowViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LexusAircShowViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable DataBindingComponent component) {
        return (LexusAircShowViewBinding) DataBindingUtil.inflate(inflater, R.layout.lexus_airc_show_view, (ViewGroup) null, false, component);
    }

    public static LexusAircShowViewBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    public static LexusAircShowViewBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
        return (LexusAircShowViewBinding) bind(component, view, R.layout.lexus_airc_show_view);
    }
}
