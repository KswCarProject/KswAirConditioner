package com.wits.ksw.airc.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.Observable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.databinding.ViewDataBinding;
import android.databinding.adapters.ImageViewBindingAdapter;
import android.databinding.adapters.TextViewBindingAdapter;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.wits.ksw.airc.ACViewModel;
import com.wits.ksw.airc.LexusUiParams;
import com.wits.ksw.airc.R;
import com.wits.ksw.airc.generated.callback.OnClickListener;

public class LexusAircShowViewBindingImpl extends LexusAircShowViewBinding implements OnClickListener.Listener {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    @Nullable
    private final View.OnClickListener mCallback1;
    @Nullable
    private final View.OnClickListener mCallback10;
    @Nullable
    private final View.OnClickListener mCallback11;
    @Nullable
    private final View.OnClickListener mCallback12;
    @Nullable
    private final View.OnClickListener mCallback2;
    @Nullable
    private final View.OnClickListener mCallback3;
    @Nullable
    private final View.OnClickListener mCallback4;
    @Nullable
    private final View.OnClickListener mCallback5;
    @Nullable
    private final View.OnClickListener mCallback6;
    @Nullable
    private final View.OnClickListener mCallback7;
    @Nullable
    private final View.OnClickListener mCallback8;
    @Nullable
    private final View.OnClickListener mCallback9;
    private long mDirtyFlags;
    @NonNull
    private final RelativeLayout mboundView0;

    public LexusAircShowViewBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }

    private LexusAircShowViewBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 10, bindings[1], bindings[3], bindings[2], bindings[13], bindings[14], bindings[17], bindings[12], bindings[16], bindings[15], bindings[9], bindings[11], bindings[10], bindings[8], bindings[4], bindings[6], bindings[7], bindings[5]);
        this.mDirtyFlags = -1;
        this.leftTempAdd.setTag((Object) null);
        this.leftTempSub.setTag((Object) null);
        this.leftTempTextView.setTag((Object) null);
        this.mboundView0 = bindings[0];
        this.mboundView0.setTag((Object) null);
        this.rightAc.setTag((Object) null);
        this.rightAuto.setTag((Object) null);
        this.rightBackMist.setTag((Object) null);
        this.rightDual.setTag((Object) null);
        this.rightFrontMist.setTag((Object) null);
        this.rightLoop.setTag((Object) null);
        this.rightTempAdd.setTag((Object) null);
        this.rightTempSub.setTag((Object) null);
        this.rightTempTextView.setTag((Object) null);
        this.textView6.setTag((Object) null);
        this.windSpeedAdd.setTag((Object) null);
        this.windSpeedImageView.setTag((Object) null);
        this.windSpeedSub.setTag((Object) null);
        this.windSpeedTextView.setTag((Object) null);
        setRootTag(root);
        this.mCallback2 = new OnClickListener(this, 2);
        this.mCallback9 = new OnClickListener(this, 9);
        this.mCallback1 = new OnClickListener(this, 1);
        this.mCallback8 = new OnClickListener(this, 8);
        this.mCallback7 = new OnClickListener(this, 7);
        this.mCallback11 = new OnClickListener(this, 11);
        this.mCallback6 = new OnClickListener(this, 6);
        this.mCallback12 = new OnClickListener(this, 12);
        this.mCallback5 = new OnClickListener(this, 5);
        this.mCallback4 = new OnClickListener(this, 4);
        this.mCallback10 = new OnClickListener(this, 10);
        this.mCallback3 = new OnClickListener(this, 3);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4096;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (1 == variableId) {
            setMUiParams((LexusUiParams) variable);
            return true;
        } else if (2 != variableId) {
            return false;
        } else {
            setViewModel((ACViewModel) variable);
            return true;
        }
    }

    public void setMUiParams(@Nullable LexusUiParams MUiParams) {
        this.mMUiParams = MUiParams;
        synchronized (this) {
            this.mDirtyFlags |= 1024;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    public void setViewModel(@Nullable ACViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2048;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return onChangeMUiParamsBackMistSwitch((ObservableBoolean) object, fieldId);
            case 1:
                return onChangeMUiParamsAutoSwitch((ObservableBoolean) object, fieldId);
            case 2:
                return onChangeMUiParamsRightTempStr((ObservableField) object, fieldId);
            case 3:
                return onChangeMUiParamsLoopMode((ObservableInt) object, fieldId);
            case 4:
                return onChangeMUiParamsFrontMistSwitch((ObservableBoolean) object, fieldId);
            case 5:
                return onChangeMUiParamsBlowingMode((ObservableInt) object, fieldId);
            case 6:
                return onChangeMUiParamsDual((ObservableBoolean) object, fieldId);
            case 7:
                return onChangeMUiParamsWindSpeed((ObservableInt) object, fieldId);
            case 8:
                return onChangeMUiParamsLeftTempStr((ObservableField) object, fieldId);
            case 9:
                return onChangeMUiParamsAcStatus((ObservableBoolean) object, fieldId);
            default:
                return false;
        }
    }

    private boolean onChangeMUiParamsBackMistSwitch(ObservableBoolean MUiParamsBackMistSwitch, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeMUiParamsAutoSwitch(ObservableBoolean MUiParamsAutoSwitch, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeMUiParamsRightTempStr(ObservableField<String> observableField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeMUiParamsLoopMode(ObservableInt MUiParamsLoopMode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeMUiParamsFrontMistSwitch(ObservableBoolean MUiParamsFrontMistSwitch, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeMUiParamsBlowingMode(ObservableInt MUiParamsBlowingMode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeMUiParamsDual(ObservableBoolean MUiParamsDual, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeMUiParamsWindSpeed(ObservableInt MUiParamsWindSpeed, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeMUiParamsLeftTempStr(ObservableField<String> observableField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    private boolean onChangeMUiParamsAcStatus(ObservableBoolean MUiParamsAcStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 512;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long dirtyFlags;
        String javaLangStringMUiParamsWindSpeed;
        int mUiParamsWindSpeedGet;
        int mUiParamsBlowingModeGet;
        String mUiParamsRightTempStrGet;
        Drawable mUiParamsDualRightDualAndroidDrawableLexusDualOnSelectorRightDualAndroidDrawableLexusDualOffSelector;
        Drawable mUiParamsAcStatusRightAcAndroidDrawableLexusAcOnSelectorRightAcAndroidDrawableLexusAcOffSelector;
        String mUiParamsLeftTempStrGet;
        Drawable mUiParamsLoopModeInt2RightLoopAndroidDrawableLexusLoopAutoSelectorMUiParamsLoopModeInt1RightLoopAndroidDrawableLexusLoopInnerSelectorRightLoopAndroidDrawableLexusLoopOutherSelector;
        long dirtyFlags2;
        ImageView imageView;
        int i;
        long dirtyFlags3;
        Drawable mUiParamsBackMistSwitchRightBackMistAndroidDrawableLexusBackDemistOnSelectorRightBackMistAndroidDrawableLexusBackDemistOffSelector;
        ObservableBoolean mUiParamsAcStatus;
        ImageView imageView2;
        int i2;
        ObservableField<String> mUiParamsLeftTempStr;
        ObservableInt mUiParamsWindSpeed;
        ObservableBoolean mUiParamsDual;
        ImageView imageView3;
        int i3;
        ObservableInt mUiParamsBlowingMode;
        ObservableBoolean mUiParamsFrontMistSwitch;
        ImageView imageView4;
        int i4;
        long j;
        ObservableInt mUiParamsLoopMode;
        ObservableField<String> mUiParamsRightTempStr;
        ImageView imageView5;
        int i5;
        long j2;
        Drawable drawable;
        synchronized (this) {
            dirtyFlags = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        LexusUiParams mUiParams = this.mMUiParams;
        Drawable mUiParamsBackMistSwitchRightBackMistAndroidDrawableLexusBackDemistOnSelectorRightBackMistAndroidDrawableLexusBackDemistOffSelector2 = null;
        boolean mUiParamsLoopModeInt1 = false;
        boolean mUiParamsBackMistSwitchGet = false;
        ObservableBoolean mUiParamsBackMistSwitch = null;
        Drawable mUiParamsFrontMistSwitchRightFrontMistAndroidDrawableLexusFrontDemistOnSelectorRightFrontMistAndroidDrawableLexusFrontDemistOffSelector = null;
        int mUiParamsLoopModeGet = 0;
        boolean mUiParamsAcStatusGet = false;
        boolean mUiParamsDualGet = false;
        Drawable mUiParamsAutoSwitchRightAutoAndroidDrawableLexusAutoOnSelectorRightAutoAndroidDrawableLexusAutoOffSelector = null;
        ObservableBoolean mUiParamsAutoSwitch = null;
        String javaLangStringMUiParamsWindSpeed2 = null;
        String mUiParamsLeftTempStrGet2 = null;
        boolean mUiParamsFrontMistSwitchGet = false;
        String mUiParamsRightTempStrGet2 = null;
        Drawable mUiParamsLoopModeInt1RightLoopAndroidDrawableLexusLoopInnerSelectorRightLoopAndroidDrawableLexusLoopOutherSelector = null;
        int mUiParamsWindSpeedGet2 = 0;
        boolean mUiParamsLoopModeInt2 = false;
        Drawable mUiParamsDualRightDualAndroidDrawableLexusDualOnSelectorRightDualAndroidDrawableLexusDualOffSelector2 = null;
        boolean mUiParamsAutoSwitchGet = false;
        int mUiParamsBlowingModeGet2 = 0;
        ACViewModel viewModel = this.mViewModel;
        if ((dirtyFlags & 6143) != 0) {
            if ((dirtyFlags & 5121) != 0) {
                if (mUiParams != null) {
                    mUiParamsBackMistSwitch = mUiParams.backMistSwitch;
                }
                updateRegistration(0, (Observable) mUiParamsBackMistSwitch);
                if (mUiParamsBackMistSwitch != null) {
                    mUiParamsBackMistSwitchGet = mUiParamsBackMistSwitch.get();
                }
                if ((dirtyFlags & 5121) != 0) {
                    if (mUiParamsBackMistSwitchGet) {
                        dirtyFlags |= 16384;
                    } else {
                        dirtyFlags |= 8192;
                    }
                }
                if (mUiParamsBackMistSwitchGet) {
                    dirtyFlags3 = dirtyFlags;
                    drawable = getDrawableFromResource(this.rightBackMist, R.drawable.lexus_back_demist_on_selector);
                } else {
                    dirtyFlags3 = dirtyFlags;
                    drawable = getDrawableFromResource(this.rightBackMist, R.drawable.lexus_back_demist_off_selector);
                }
                mUiParamsBackMistSwitchRightBackMistAndroidDrawableLexusBackDemistOnSelectorRightBackMistAndroidDrawableLexusBackDemistOffSelector2 = drawable;
            } else {
                dirtyFlags3 = dirtyFlags;
            }
            if ((dirtyFlags3 & 5122) != 0) {
                if (mUiParams != null) {
                    mUiParamsAutoSwitch = mUiParams.autoSwitch;
                }
                updateRegistration(1, (Observable) mUiParamsAutoSwitch);
                if (mUiParamsAutoSwitch != null) {
                    mUiParamsAutoSwitchGet = mUiParamsAutoSwitch.get();
                }
                if ((dirtyFlags3 & 5122) != 0) {
                    if (mUiParamsAutoSwitchGet) {
                        j2 = dirtyFlags3 | 262144;
                    } else {
                        j2 = dirtyFlags3 | 131072;
                    }
                    dirtyFlags3 = j2;
                }
                if (mUiParamsAutoSwitchGet) {
                    imageView5 = this.rightAuto;
                    i5 = R.drawable.lexus_auto_on_selector;
                } else {
                    imageView5 = this.rightAuto;
                    i5 = R.drawable.lexus_auto_off_selector;
                }
                mUiParamsAutoSwitchRightAutoAndroidDrawableLexusAutoOnSelectorRightAutoAndroidDrawableLexusAutoOffSelector = getDrawableFromResource(imageView5, i5);
            }
            if ((dirtyFlags3 & 5124) != 0) {
                if (mUiParams != null) {
                    mUiParamsRightTempStr = mUiParams.rightTempStr;
                } else {
                    mUiParamsRightTempStr = null;
                }
                updateRegistration(2, (Observable) mUiParamsRightTempStr);
                if (mUiParamsRightTempStr != null) {
                    ObservableField<String> observableField = mUiParamsRightTempStr;
                    mUiParamsRightTempStrGet2 = mUiParamsRightTempStr.get();
                } else {
                    ObservableField<String> observableField2 = mUiParamsRightTempStr;
                }
            }
            if ((dirtyFlags3 & 5128) != 0) {
                if (mUiParams != null) {
                    mUiParamsLoopMode = mUiParams.loopMode;
                } else {
                    mUiParamsLoopMode = null;
                }
                updateRegistration(3, (Observable) mUiParamsLoopMode);
                if (mUiParamsLoopMode != null) {
                    mUiParamsLoopModeGet = mUiParamsLoopMode.get();
                }
                boolean mUiParamsLoopModeInt22 = mUiParamsLoopModeGet == 2;
                if ((dirtyFlags3 & 5128) != 0) {
                    if (mUiParamsLoopModeInt22) {
                        dirtyFlags3 |= 16777216;
                    } else {
                        dirtyFlags3 |= 8388608;
                    }
                }
                mUiParamsLoopModeInt2 = mUiParamsLoopModeInt22;
            }
            if ((dirtyFlags3 & 5136) != 0) {
                if (mUiParams != null) {
                    mUiParamsFrontMistSwitch = mUiParams.frontMistSwitch;
                } else {
                    mUiParamsFrontMistSwitch = null;
                }
                updateRegistration(4, (Observable) mUiParamsFrontMistSwitch);
                if (mUiParamsFrontMistSwitch != null) {
                    mUiParamsFrontMistSwitchGet = mUiParamsFrontMistSwitch.get();
                }
                if ((dirtyFlags3 & 5136) != 0) {
                    if (mUiParamsFrontMistSwitchGet) {
                        j = dirtyFlags3 | 65536;
                    } else {
                        j = dirtyFlags3 | 32768;
                    }
                    dirtyFlags3 = j;
                }
                if (mUiParamsFrontMistSwitchGet) {
                    imageView4 = this.rightFrontMist;
                    i4 = R.drawable.lexus_front_demist_on_selector;
                } else {
                    imageView4 = this.rightFrontMist;
                    i4 = R.drawable.lexus_front_demist_off_selector;
                }
                ObservableBoolean observableBoolean = mUiParamsFrontMistSwitch;
                mUiParamsFrontMistSwitchRightFrontMistAndroidDrawableLexusFrontDemistOnSelectorRightFrontMistAndroidDrawableLexusFrontDemistOffSelector = getDrawableFromResource(imageView4, i4);
            }
            if ((dirtyFlags3 & 5152) != 0) {
                if (mUiParams != null) {
                    mUiParamsBlowingMode = mUiParams.blowingMode;
                } else {
                    mUiParamsBlowingMode = null;
                }
                updateRegistration(5, (Observable) mUiParamsBlowingMode);
                if (mUiParamsBlowingMode != null) {
                    ObservableInt observableInt = mUiParamsBlowingMode;
                    mUiParamsBlowingModeGet2 = mUiParamsBlowingMode.get();
                } else {
                    ObservableInt observableInt2 = mUiParamsBlowingMode;
                }
            }
            if ((dirtyFlags3 & 5184) != 0) {
                if (mUiParams != null) {
                    mUiParamsDual = mUiParams.dual;
                } else {
                    mUiParamsDual = null;
                }
                updateRegistration(6, (Observable) mUiParamsDual);
                if (mUiParamsDual != null) {
                    mUiParamsDualGet = mUiParamsDual.get();
                }
                if ((dirtyFlags3 & 5184) != 0) {
                    if (mUiParamsDualGet) {
                        dirtyFlags3 |= 4194304;
                    } else {
                        dirtyFlags3 |= 2097152;
                    }
                }
                if (mUiParamsDualGet) {
                    imageView3 = this.rightDual;
                    i3 = R.drawable.lexus_dual_on_selector;
                } else {
                    imageView3 = this.rightDual;
                    i3 = R.drawable.lexus_dual_off_selector;
                }
                ObservableBoolean observableBoolean2 = mUiParamsDual;
                mUiParamsDualRightDualAndroidDrawableLexusDualOnSelectorRightDualAndroidDrawableLexusDualOffSelector2 = getDrawableFromResource(imageView3, i3);
            }
            dirtyFlags = dirtyFlags3;
            if ((dirtyFlags & 5248) != 0) {
                if (mUiParams != null) {
                    mUiParamsWindSpeed = mUiParams.windSpeed;
                } else {
                    mUiParamsWindSpeed = null;
                }
                ACViewModel aCViewModel = viewModel;
                updateRegistration(7, (Observable) mUiParamsWindSpeed);
                if (mUiParamsWindSpeed != null) {
                    mUiParamsWindSpeedGet2 = mUiParamsWindSpeed.get();
                }
                int mUiParamsWindSpeedGet3 = mUiParamsWindSpeedGet2;
                ObservableInt mUiParamsWindSpeed2 = mUiParamsWindSpeed;
                StringBuilder sb = new StringBuilder();
                mUiParamsBackMistSwitchRightBackMistAndroidDrawableLexusBackDemistOnSelectorRightBackMistAndroidDrawableLexusBackDemistOffSelector = mUiParamsBackMistSwitchRightBackMistAndroidDrawableLexusBackDemistOnSelectorRightBackMistAndroidDrawableLexusBackDemistOffSelector2;
                sb.append("");
                sb.append(mUiParamsWindSpeedGet3);
                mUiParamsWindSpeedGet2 = mUiParamsWindSpeedGet3;
                javaLangStringMUiParamsWindSpeed2 = sb.toString();
                ObservableInt observableInt3 = mUiParamsWindSpeed2;
            } else {
                mUiParamsBackMistSwitchRightBackMistAndroidDrawableLexusBackDemistOnSelectorRightBackMistAndroidDrawableLexusBackDemistOffSelector = mUiParamsBackMistSwitchRightBackMistAndroidDrawableLexusBackDemistOnSelectorRightBackMistAndroidDrawableLexusBackDemistOffSelector2;
            }
            if ((dirtyFlags & 5376) != 0) {
                if (mUiParams != null) {
                    mUiParamsLeftTempStr = mUiParams.leftTempStr;
                } else {
                    mUiParamsLeftTempStr = null;
                }
                updateRegistration(8, (Observable) mUiParamsLeftTempStr);
                if (mUiParamsLeftTempStr != null) {
                    ObservableField<String> observableField3 = mUiParamsLeftTempStr;
                    mUiParamsLeftTempStrGet2 = mUiParamsLeftTempStr.get();
                } else {
                    ObservableField<String> observableField4 = mUiParamsLeftTempStr;
                }
            }
            if ((dirtyFlags & 5632) != 0) {
                if (mUiParams != null) {
                    mUiParamsAcStatus = mUiParams.acStatus;
                } else {
                    mUiParamsAcStatus = null;
                }
                updateRegistration(9, (Observable) mUiParamsAcStatus);
                if (mUiParamsAcStatus != null) {
                    mUiParamsAcStatusGet = mUiParamsAcStatus.get();
                }
                if ((dirtyFlags & 5632) != 0) {
                    if (mUiParamsAcStatusGet) {
                        dirtyFlags |= 67108864;
                    } else {
                        dirtyFlags |= 33554432;
                    }
                }
                if (mUiParamsAcStatusGet) {
                    imageView2 = this.rightAc;
                    i2 = R.drawable.lexus_ac_on_selector;
                } else {
                    imageView2 = this.rightAc;
                    i2 = R.drawable.lexus_ac_off_selector;
                }
                mUiParamsAcStatusRightAcAndroidDrawableLexusAcOnSelectorRightAcAndroidDrawableLexusAcOffSelector = getDrawableFromResource(imageView2, i2);
                ObservableBoolean observableBoolean3 = mUiParamsAcStatus;
                mUiParamsLeftTempStrGet = mUiParamsLeftTempStrGet2;
            } else {
                mUiParamsLeftTempStrGet = mUiParamsLeftTempStrGet2;
                mUiParamsAcStatusRightAcAndroidDrawableLexusAcOnSelectorRightAcAndroidDrawableLexusAcOffSelector = null;
            }
            mUiParamsBackMistSwitchRightBackMistAndroidDrawableLexusBackDemistOnSelectorRightBackMistAndroidDrawableLexusBackDemistOffSelector2 = mUiParamsBackMistSwitchRightBackMistAndroidDrawableLexusBackDemistOnSelectorRightBackMistAndroidDrawableLexusBackDemistOffSelector;
            javaLangStringMUiParamsWindSpeed = javaLangStringMUiParamsWindSpeed2;
            mUiParamsRightTempStrGet = mUiParamsRightTempStrGet2;
            mUiParamsBlowingModeGet = mUiParamsBlowingModeGet2;
            boolean z = mUiParamsFrontMistSwitchGet;
            mUiParamsDualRightDualAndroidDrawableLexusDualOnSelectorRightDualAndroidDrawableLexusDualOffSelector = mUiParamsDualRightDualAndroidDrawableLexusDualOnSelectorRightDualAndroidDrawableLexusDualOffSelector2;
            boolean mUiParamsFrontMistSwitchGet2 = z;
            int i6 = mUiParamsWindSpeedGet2;
            mUiParamsWindSpeedGet = i6;
        } else {
            mUiParamsLeftTempStrGet = null;
            mUiParamsAcStatusRightAcAndroidDrawableLexusAcOnSelectorRightAcAndroidDrawableLexusAcOffSelector = null;
            javaLangStringMUiParamsWindSpeed = null;
            mUiParamsRightTempStrGet = null;
            mUiParamsBlowingModeGet = 0;
            mUiParamsDualRightDualAndroidDrawableLexusDualOnSelectorRightDualAndroidDrawableLexusDualOffSelector = null;
            mUiParamsWindSpeedGet = 0;
        }
        if ((dirtyFlags & 8388608) != 0) {
            LexusUiParams lexusUiParams = mUiParams;
            boolean z2 = true;
            if (mUiParamsLoopModeGet != 1) {
                z2 = false;
            }
            mUiParamsLoopModeInt1 = z2;
            if ((dirtyFlags & 8388608) != 0) {
                if (mUiParamsLoopModeInt1) {
                    dirtyFlags |= 1048576;
                } else {
                    dirtyFlags |= 524288;
                }
            }
            if (mUiParamsLoopModeInt1) {
                imageView = this.rightLoop;
                dirtyFlags2 = dirtyFlags;
                i = R.drawable.lexus_loop_inner_selector;
            } else {
                dirtyFlags2 = dirtyFlags;
                imageView = this.rightLoop;
                i = R.drawable.lexus_loop_outher_selector;
            }
            mUiParamsLoopModeInt1RightLoopAndroidDrawableLexusLoopInnerSelectorRightLoopAndroidDrawableLexusLoopOutherSelector = getDrawableFromResource(imageView, i);
            dirtyFlags = dirtyFlags2;
        }
        if ((dirtyFlags & 5128) != 0) {
            if (mUiParamsLoopModeInt2) {
                boolean z3 = mUiParamsLoopModeInt1;
                mUiParamsLoopModeInt2RightLoopAndroidDrawableLexusLoopAutoSelectorMUiParamsLoopModeInt1RightLoopAndroidDrawableLexusLoopInnerSelectorRightLoopAndroidDrawableLexusLoopOutherSelector = getDrawableFromResource(this.rightLoop, R.drawable.lexus_loop_auto_selector);
            } else {
                mUiParamsLoopModeInt2RightLoopAndroidDrawableLexusLoopAutoSelectorMUiParamsLoopModeInt1RightLoopAndroidDrawableLexusLoopInnerSelectorRightLoopAndroidDrawableLexusLoopOutherSelector = mUiParamsLoopModeInt1RightLoopAndroidDrawableLexusLoopInnerSelectorRightLoopAndroidDrawableLexusLoopOutherSelector;
            }
        } else {
            mUiParamsLoopModeInt2RightLoopAndroidDrawableLexusLoopAutoSelectorMUiParamsLoopModeInt1RightLoopAndroidDrawableLexusLoopInnerSelectorRightLoopAndroidDrawableLexusLoopOutherSelector = null;
        }
        if ((dirtyFlags & 4096) != 0) {
            int i7 = mUiParamsLoopModeGet;
            this.leftTempAdd.setOnClickListener(this.mCallback1);
            this.leftTempSub.setOnClickListener(this.mCallback2);
            this.rightAc.setOnClickListener(this.mCallback8);
            this.rightAuto.setOnClickListener(this.mCallback9);
            this.rightBackMist.setOnClickListener(this.mCallback12);
            this.rightDual.setOnClickListener(this.mCallback7);
            this.rightFrontMist.setOnClickListener(this.mCallback11);
            this.rightLoop.setOnClickListener(this.mCallback10);
            this.rightTempAdd.setOnClickListener(this.mCallback5);
            this.rightTempSub.setOnClickListener(this.mCallback6);
            this.windSpeedAdd.setOnClickListener(this.mCallback3);
            this.windSpeedSub.setOnClickListener(this.mCallback4);
        }
        if ((dirtyFlags & 5376) != 0) {
            TextViewBindingAdapter.setText(this.leftTempTextView, mUiParamsLeftTempStrGet);
        }
        if ((dirtyFlags & 5632) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.rightAc, mUiParamsAcStatusRightAcAndroidDrawableLexusAcOnSelectorRightAcAndroidDrawableLexusAcOffSelector);
        }
        if ((dirtyFlags & 5122) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.rightAuto, mUiParamsAutoSwitchRightAutoAndroidDrawableLexusAutoOnSelectorRightAutoAndroidDrawableLexusAutoOffSelector);
        }
        if ((dirtyFlags & 5121) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.rightBackMist, mUiParamsBackMistSwitchRightBackMistAndroidDrawableLexusBackDemistOnSelectorRightBackMistAndroidDrawableLexusBackDemistOffSelector2);
        }
        if ((dirtyFlags & 5184) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.rightDual, mUiParamsDualRightDualAndroidDrawableLexusDualOnSelectorRightDualAndroidDrawableLexusDualOffSelector);
        }
        if ((dirtyFlags & 5136) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.rightFrontMist, mUiParamsFrontMistSwitchRightFrontMistAndroidDrawableLexusFrontDemistOnSelectorRightFrontMistAndroidDrawableLexusFrontDemistOffSelector);
        }
        if ((dirtyFlags & 5128) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.rightLoop, mUiParamsLoopModeInt2RightLoopAndroidDrawableLexusLoopAutoSelectorMUiParamsLoopModeInt1RightLoopAndroidDrawableLexusLoopInnerSelectorRightLoopAndroidDrawableLexusLoopOutherSelector);
        }
        if ((dirtyFlags & 5124) != 0) {
            TextViewBindingAdapter.setText(this.rightTempTextView, mUiParamsRightTempStrGet);
        }
        if ((dirtyFlags & 5152) != 0) {
            this.textView6.setImageLevel(mUiParamsBlowingModeGet);
        }
        if ((dirtyFlags & 5248) != 0) {
            this.windSpeedImageView.setImageLevel(mUiParamsWindSpeedGet);
            TextViewBindingAdapter.setText(this.windSpeedTextView, javaLangStringMUiParamsWindSpeed);
        }
    }

    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        boolean viewModelJavaLangObjectNull = false;
        switch (sourceId) {
            case 1:
                ACViewModel viewModel = this.mViewModel;
                if (viewModel != null) {
                    viewModelJavaLangObjectNull = true;
                }
                if (viewModelJavaLangObjectNull) {
                    viewModel.leftTmpAdd(callbackArg_0);
                    return;
                }
                return;
            case 2:
                ACViewModel viewModel2 = this.mViewModel;
                if (viewModel2 != null) {
                    viewModelJavaLangObjectNull = true;
                }
                if (viewModelJavaLangObjectNull) {
                    viewModel2.leftTmpReduce(callbackArg_0);
                    return;
                }
                return;
            case 3:
                ACViewModel viewModel3 = this.mViewModel;
                if (viewModel3 != null) {
                    viewModelJavaLangObjectNull = true;
                }
                if (viewModelJavaLangObjectNull) {
                    viewModel3.speedAdd(callbackArg_0);
                    return;
                }
                return;
            case 4:
                ACViewModel viewModel4 = this.mViewModel;
                if (viewModel4 != null) {
                    viewModelJavaLangObjectNull = true;
                }
                if (viewModelJavaLangObjectNull) {
                    viewModel4.speedReduce(callbackArg_0);
                    return;
                }
                return;
            case 5:
                ACViewModel viewModel5 = this.mViewModel;
                if (viewModel5 != null) {
                    viewModelJavaLangObjectNull = true;
                }
                if (viewModelJavaLangObjectNull) {
                    viewModel5.rightTmpAdd(callbackArg_0);
                    return;
                }
                return;
            case 6:
                ACViewModel viewModel6 = this.mViewModel;
                if (viewModel6 != null) {
                    viewModelJavaLangObjectNull = true;
                }
                if (viewModelJavaLangObjectNull) {
                    viewModel6.rightTmpReduce(callbackArg_0);
                    return;
                }
                return;
            case 7:
                ACViewModel viewModel7 = this.mViewModel;
                if (viewModel7 != null) {
                    viewModelJavaLangObjectNull = true;
                }
                if (viewModelJavaLangObjectNull) {
                    viewModel7.dual(callbackArg_0);
                    return;
                }
                return;
            case 8:
                ACViewModel viewModel8 = this.mViewModel;
                if (viewModel8 != null) {
                    viewModelJavaLangObjectNull = true;
                }
                if (viewModelJavaLangObjectNull) {
                    viewModel8.ac(callbackArg_0);
                    return;
                }
                return;
            case 9:
                ACViewModel viewModel9 = this.mViewModel;
                if (viewModel9 != null) {
                    viewModelJavaLangObjectNull = true;
                }
                if (viewModelJavaLangObjectNull) {
                    viewModel9.autoSwitch(callbackArg_0);
                    return;
                }
                return;
            case 10:
                ACViewModel viewModel10 = this.mViewModel;
                if (viewModel10 != null) {
                    viewModelJavaLangObjectNull = true;
                }
                if (viewModelJavaLangObjectNull) {
                    viewModel10.loop(callbackArg_0);
                    return;
                }
                return;
            case 11:
                ACViewModel viewModel11 = this.mViewModel;
                if (viewModel11 != null) {
                    viewModelJavaLangObjectNull = true;
                }
                if (viewModelJavaLangObjectNull) {
                    viewModel11.frontMistSwitch(callbackArg_0);
                    return;
                }
                return;
            case 12:
                ACViewModel viewModel12 = this.mViewModel;
                if (viewModel12 != null) {
                    viewModelJavaLangObjectNull = true;
                }
                if (viewModelJavaLangObjectNull) {
                    viewModel12.backMistSwitch(callbackArg_0);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
