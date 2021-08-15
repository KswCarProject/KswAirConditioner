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
import android.support.constraint.ConstraintLayout;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import com.wits.ksw.airc.R;
import com.wits.ksw.airc.UiParams;

public class AircShowViewBindingImpl extends AircShowViewBinding {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    @Nullable
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    @NonNull
    private final ConstraintLayout mboundView0;
    @NonNull
    private final ConstraintLayout mboundView1;
    @NonNull
    private final ImageView mboundView5;

    static {
        sViewsWithIds.put(R.id.windSpeedImageView, 13);
    }

    public AircShowViewBindingImpl(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AircShowViewBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 12, bindings[3], bindings[2], bindings[12], bindings[4], bindings[7], bindings[8], bindings[9], bindings[10], bindings[11], bindings[13], bindings[6]);
        this.mDirtyFlags = -1;
        this.leftTempImage.setTag((Object) null);
        this.leftTempTextView.setTag((Object) null);
        this.mboundView0 = bindings[0];
        this.mboundView0.setTag((Object) null);
        this.mboundView1 = bindings[1];
        this.mboundView1.setTag((Object) null);
        this.mboundView5 = bindings[5];
        this.mboundView5.setTag((Object) null);
        this.textView.setTag((Object) null);
        this.textView2.setTag((Object) null);
        this.textView4.setTag((Object) null);
        this.textView5.setTag((Object) null);
        this.textView6.setTag((Object) null);
        this.textView7.setTag((Object) null);
        this.textView8.setTag((Object) null);
        this.windSpeedTextView.setTag((Object) null);
        setRootTag(root);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 8192;
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
        if (1 != variableId) {
            return false;
        }
        setMUiParams((UiParams) variable);
        return true;
    }

    public void setMUiParams(@Nullable UiParams MUiParams) {
        this.mMUiParams = MUiParams;
        synchronized (this) {
            this.mDirtyFlags |= 4096;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return onChangeMUiParamsMax((ObservableInt) object, fieldId);
            case 1:
                return onChangeMUiParamsLeftBlowingMode((ObservableInt) object, fieldId);
            case 2:
                return onChangeMUiParamsRightBlowingMode((ObservableInt) object, fieldId);
            case 3:
                return onChangeMUiParamsAutoSwitch((ObservableBoolean) object, fieldId);
            case 4:
                return onChangeMUiParamsRear((ObservableInt) object, fieldId);
            case 5:
                return onChangeMUiParamsLoopMode((ObservableInt) object, fieldId);
            case 6:
                return onChangeMUiParamsRightTempStr((ObservableField) object, fieldId);
            case 7:
                return onChangeMUiParamsFrontMistSwitch((ObservableBoolean) object, fieldId);
            case 8:
                return onChangeMUiParamsWindSpeed((ObservableInt) object, fieldId);
            case 9:
                return onChangeMUiParamsLeftTempStr((ObservableField) object, fieldId);
            case 10:
                return onChangeMUiParamsIsOpen((ObservableBoolean) object, fieldId);
            case 11:
                return onChangeMUiParamsAcStatus((ObservableInt) object, fieldId);
            default:
                return false;
        }
    }

    private boolean onChangeMUiParamsMax(ObservableInt MUiParamsMax, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeMUiParamsLeftBlowingMode(ObservableInt MUiParamsLeftBlowingMode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeMUiParamsRightBlowingMode(ObservableInt MUiParamsRightBlowingMode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeMUiParamsAutoSwitch(ObservableBoolean MUiParamsAutoSwitch, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeMUiParamsRear(ObservableInt MUiParamsRear, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeMUiParamsLoopMode(ObservableInt MUiParamsLoopMode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeMUiParamsRightTempStr(ObservableField<String> observableField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeMUiParamsFrontMistSwitch(ObservableBoolean MUiParamsFrontMistSwitch, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeMUiParamsWindSpeed(ObservableInt MUiParamsWindSpeed, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    private boolean onChangeMUiParamsLeftTempStr(ObservableField<String> observableField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 512;
        }
        return true;
    }

    private boolean onChangeMUiParamsIsOpen(ObservableBoolean MUiParamsIsOpen, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1024;
        }
        return true;
    }

    private boolean onChangeMUiParamsAcStatus(ObservableInt MUiParamsAcStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2048;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long dirtyFlags;
        String mUiParamsRightTempStrGet;
        String javaLangStringMUiParamsWindSpeed;
        int mUiParamsRearGet;
        ObservableInt mUiParamsLoopMode;
        boolean mUiParamsLoopModeInt1;
        int mUiParamsLoopModeGet;
        int mUiParamsLoopModeGet2;
        String mUiParamsRightTempStrGet2;
        ObservableInt mUiParamsRear;
        ObservableInt mUiParamsAcStatus;
        ImageView imageView;
        int i;
        ObservableBoolean mUiParamsIsOpen;
        ObservableField<String> mUiParamsLeftTempStr;
        ObservableInt mUiParamsWindSpeed;
        ObservableBoolean mUiParamsFrontMistSwitch;
        ObservableField<String> mUiParamsRightTempStr;
        ObservableBoolean mUiParamsAutoSwitch;
        ObservableInt mUiParamsRightBlowingMode;
        synchronized (this) {
            dirtyFlags = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        UiParams mUiParams = this.mMUiParams;
        ObservableInt mUiParamsMax = null;
        boolean mUiParamsIsOpenGet = false;
        int mUiParamsFrontMistSwitchViewINVISIBLEViewVISIBLE = 0;
        int mUiParamsAcStatusGet = 0;
        int mUiParamsAutoSwitchViewGONEViewVISIBLE = 0;
        ObservableInt mUiParamsLeftBlowingMode = null;
        boolean mUiParamsAcStatusInt1 = false;
        ObservableInt mUiParamsRightBlowingMode2 = null;
        int mUiParamsLoopModeInt1ViewVISIBLEViewINVISIBLE = 0;
        ObservableBoolean mUiParamsAutoSwitch2 = null;
        Drawable mUiParamsAcStatusInt1TextView4AndroidDrawableNtg55AcOnTextView4AndroidDrawableNtg55AcOff = null;
        int mUiParamsMaxInt1ViewVISIBLEViewINVISIBLE = 0;
        int mUiParamsRearInt1ViewVISIBLEViewINVISIBLE = 0;
        int mUiParamsIsOpenViewVISIBLEViewGONE = 0;
        String javaLangStringMUiParamsWindSpeed2 = null;
        int mUiParamsLeftBlowingModeGet = 0;
        String mUiParamsLeftTempStrGet = null;
        int mUiParamsRearGet2 = 0;
        boolean mUiParamsFrontMistSwitchGet = false;
        String mUiParamsRightTempStrGet3 = null;
        int mUiParamsWindSpeedGet = 0;
        int mUiParamsRightBlowingModeGet = 0;
        int mUiParamsAutoSwitchViewVISIBLEViewGONE = 0;
        int mUiParamsFrontMistSwitchViewINVISIBLEMUiParamsLoopModeInt1ViewVISIBLEViewINVISIBLE = 0;
        int mUiParamsMaxGet = 0;
        boolean mUiParamsAutoSwitchGet = false;
        int mUiParamsIsOpenViewGONEViewVISIBLE = 0;
        if ((dirtyFlags & 16383) != 0) {
            if ((dirtyFlags & 12289) != 0) {
                if (mUiParams != null) {
                    mUiParamsMax = mUiParams.max;
                }
                updateRegistration(0, (Observable) mUiParamsMax);
                if (mUiParamsMax != null) {
                    mUiParamsMaxGet = mUiParamsMax.get();
                }
                int mUiParamsMaxGet2 = mUiParamsMaxGet;
                boolean mUiParamsMaxInt1 = mUiParamsMaxGet2 == 1;
                if ((dirtyFlags & 12289) != 0) {
                    if (mUiParamsMaxInt1) {
                        dirtyFlags |= 33554432;
                    } else {
                        dirtyFlags |= 16777216;
                    }
                }
                mUiParamsMaxInt1ViewVISIBLEViewINVISIBLE = mUiParamsMaxInt1 ? 0 : 4;
                int i2 = mUiParamsMaxGet2;
            }
            if ((dirtyFlags & 12290) != 0) {
                if (mUiParams != null) {
                    mUiParamsLeftBlowingMode = mUiParams.leftBlowingMode;
                }
                updateRegistration(1, (Observable) mUiParamsLeftBlowingMode);
                if (mUiParamsLeftBlowingMode != null) {
                    mUiParamsLeftBlowingModeGet = mUiParamsLeftBlowingMode.get();
                }
            }
            if ((dirtyFlags & 12292) != 0) {
                if (mUiParams != null) {
                    mUiParamsRightBlowingMode = mUiParams.rightBlowingMode;
                } else {
                    mUiParamsRightBlowingMode = null;
                }
                updateRegistration(2, (Observable) mUiParamsRightBlowingMode);
                if (mUiParamsRightBlowingMode != null) {
                    mUiParamsRightBlowingMode2 = mUiParamsRightBlowingMode;
                    mUiParamsRightBlowingModeGet = mUiParamsRightBlowingMode.get();
                } else {
                    mUiParamsRightBlowingMode2 = mUiParamsRightBlowingMode;
                }
            }
            ObservableInt observableInt = mUiParamsMax;
            if ((dirtyFlags & 12296) != 0) {
                if (mUiParams != null) {
                    mUiParamsAutoSwitch = mUiParams.autoSwitch;
                } else {
                    mUiParamsAutoSwitch = null;
                }
                updateRegistration(3, (Observable) mUiParamsAutoSwitch);
                if (mUiParamsAutoSwitch != null) {
                    mUiParamsAutoSwitchGet = mUiParamsAutoSwitch.get();
                }
                if ((dirtyFlags & 12296) != 0) {
                    if (mUiParamsAutoSwitchGet) {
                        dirtyFlags = dirtyFlags | 524288 | 2147483648L;
                    } else {
                        dirtyFlags = dirtyFlags | 262144 | 1073741824;
                    }
                }
                int mUiParamsAutoSwitchViewGONEViewVISIBLE2 = mUiParamsAutoSwitchGet ? 8 : 0;
                mUiParamsAutoSwitch2 = mUiParamsAutoSwitch;
                mUiParamsAutoSwitchViewVISIBLEViewGONE = mUiParamsAutoSwitchGet ? 0 : 8;
                mUiParamsAutoSwitchViewGONEViewVISIBLE = mUiParamsAutoSwitchViewGONEViewVISIBLE2;
            }
            if ((12352 & dirtyFlags) != 0) {
                if (mUiParams != null) {
                    mUiParamsRightTempStr = mUiParams.rightTempStr;
                } else {
                    mUiParamsRightTempStr = null;
                }
                updateRegistration(6, (Observable) mUiParamsRightTempStr);
                if (mUiParamsRightTempStr != null) {
                    ObservableField<String> observableField = mUiParamsRightTempStr;
                    mUiParamsRightTempStrGet3 = mUiParamsRightTempStr.get();
                } else {
                    ObservableField<String> observableField2 = mUiParamsRightTempStr;
                }
            }
            if ((12464 & dirtyFlags) != 0) {
                if (mUiParams != null) {
                    mUiParamsFrontMistSwitch = mUiParams.frontMistSwitch;
                } else {
                    mUiParamsFrontMistSwitch = null;
                }
                updateRegistration(7, (Observable) mUiParamsFrontMistSwitch);
                if (mUiParamsFrontMistSwitch != null) {
                    mUiParamsFrontMistSwitchGet = mUiParamsFrontMistSwitch.get();
                }
                if ((dirtyFlags & 12432) != 0) {
                    if (mUiParamsFrontMistSwitchGet) {
                        dirtyFlags |= 32768;
                    } else {
                        dirtyFlags |= 16384;
                    }
                }
                if ((dirtyFlags & 12416) != 0) {
                    if (mUiParamsFrontMistSwitchGet) {
                        dirtyFlags |= 131072;
                    } else {
                        dirtyFlags |= 65536;
                    }
                }
                if ((dirtyFlags & 12448) != 0) {
                    if (mUiParamsFrontMistSwitchGet) {
                        dirtyFlags |= 8589934592L;
                    } else {
                        dirtyFlags |= 4294967296L;
                    }
                }
                if ((dirtyFlags & 12416) != 0) {
                    ObservableBoolean observableBoolean = mUiParamsFrontMistSwitch;
                    mUiParamsFrontMistSwitchViewINVISIBLEViewVISIBLE = mUiParamsFrontMistSwitchGet ? 4 : 0;
                } else {
                    ObservableBoolean observableBoolean2 = mUiParamsFrontMistSwitch;
                }
            }
            if ((12544 & dirtyFlags) != 0) {
                if (mUiParams != null) {
                    mUiParamsWindSpeed = mUiParams.windSpeed;
                } else {
                    mUiParamsWindSpeed = null;
                }
                updateRegistration(8, (Observable) mUiParamsWindSpeed);
                if (mUiParamsWindSpeed != null) {
                    mUiParamsWindSpeedGet = mUiParamsWindSpeed.get();
                }
                int mUiParamsWindSpeedGet2 = mUiParamsWindSpeedGet;
                javaLangStringMUiParamsWindSpeed2 = "" + mUiParamsWindSpeedGet2;
                int i3 = mUiParamsWindSpeedGet2;
                ObservableInt observableInt2 = mUiParamsWindSpeed;
            }
            if ((12800 & dirtyFlags) != 0) {
                if (mUiParams != null) {
                    mUiParamsLeftTempStr = mUiParams.leftTempStr;
                } else {
                    mUiParamsLeftTempStr = null;
                }
                updateRegistration(9, (Observable) mUiParamsLeftTempStr);
                if (mUiParamsLeftTempStr != null) {
                    ObservableField<String> observableField3 = mUiParamsLeftTempStr;
                    mUiParamsLeftTempStrGet = mUiParamsLeftTempStr.get();
                } else {
                    ObservableField<String> observableField4 = mUiParamsLeftTempStr;
                }
            }
            if ((dirtyFlags & 13312) != 0) {
                if (mUiParams != null) {
                    mUiParamsIsOpen = mUiParams.isOpen;
                } else {
                    mUiParamsIsOpen = null;
                }
                updateRegistration(10, (Observable) mUiParamsIsOpen);
                if (mUiParamsIsOpen != null) {
                    mUiParamsIsOpenGet = mUiParamsIsOpen.get();
                }
                if ((dirtyFlags & 13312) != 0) {
                    if (mUiParamsIsOpenGet) {
                        dirtyFlags = dirtyFlags | 536870912 | 34359738368L;
                    } else {
                        dirtyFlags = dirtyFlags | 268435456 | 17179869184L;
                    }
                }
                ObservableBoolean observableBoolean3 = mUiParamsIsOpen;
                mUiParamsIsOpenViewVISIBLEViewGONE = mUiParamsIsOpenGet ? 0 : 8;
                mUiParamsIsOpenViewGONEViewVISIBLE = mUiParamsIsOpenGet ? 8 : 0;
            }
            if ((dirtyFlags & 14336) != 0) {
                if (mUiParams != null) {
                    mUiParamsAcStatus = mUiParams.acStatus;
                } else {
                    mUiParamsAcStatus = null;
                }
                updateRegistration(11, (Observable) mUiParamsAcStatus);
                if (mUiParamsAcStatus != null) {
                    mUiParamsAcStatusGet = mUiParamsAcStatus.get();
                }
                mUiParamsAcStatusInt1 = mUiParamsAcStatusGet == 1;
                if ((dirtyFlags & 14336) != 0) {
                    if (mUiParamsAcStatusInt1) {
                        dirtyFlags |= 8388608;
                    } else {
                        dirtyFlags |= 4194304;
                    }
                }
                if (mUiParamsAcStatusInt1) {
                    imageView = this.textView4;
                    i = R.drawable.ntg55_ac_on;
                } else {
                    imageView = this.textView4;
                    i = R.drawable.ntg55_ac_off;
                }
                mUiParamsAcStatusInt1TextView4AndroidDrawableNtg55AcOnTextView4AndroidDrawableNtg55AcOff = getDrawableFromResource(imageView, i);
                ObservableInt observableInt3 = mUiParamsAcStatus;
            }
        }
        int mUiParamsIsOpenViewVISIBLEViewGONE2 = mUiParamsIsOpenViewVISIBLEViewGONE;
        String javaLangStringMUiParamsWindSpeed3 = javaLangStringMUiParamsWindSpeed2;
        int mUiParamsLeftBlowingModeGet2 = mUiParamsLeftBlowingModeGet;
        String mUiParamsRightTempStrGet4 = mUiParamsRightTempStrGet3;
        int mUiParamsRightBlowingModeGet2 = mUiParamsRightBlowingModeGet;
        int mUiParamsIsOpenViewGONEViewVISIBLE2 = mUiParamsIsOpenViewGONEViewVISIBLE;
        Drawable mUiParamsAcStatusInt1TextView4AndroidDrawableNtg55AcOnTextView4AndroidDrawableNtg55AcOff2 = mUiParamsAcStatusInt1TextView4AndroidDrawableNtg55AcOnTextView4AndroidDrawableNtg55AcOff;
        int mUiParamsAutoSwitchViewVISIBLEViewGONE2 = mUiParamsAutoSwitchViewVISIBLEViewGONE;
        int mUiParamsMaxInt1ViewVISIBLEViewINVISIBLE2 = mUiParamsMaxInt1ViewVISIBLEViewINVISIBLE;
        String mUiParamsLeftTempStrGet2 = mUiParamsLeftTempStrGet;
        if ((dirtyFlags & 16384) != 0) {
            if (mUiParams != null) {
                javaLangStringMUiParamsWindSpeed = javaLangStringMUiParamsWindSpeed3;
                mUiParamsRear = mUiParams.rear;
            } else {
                javaLangStringMUiParamsWindSpeed = javaLangStringMUiParamsWindSpeed3;
                mUiParamsRear = null;
            }
            mUiParamsRightTempStrGet = mUiParamsRightTempStrGet4;
            updateRegistration(4, (Observable) mUiParamsRear);
            if (mUiParamsRear != null) {
                mUiParamsRearGet2 = mUiParamsRear.get();
            }
            mUiParamsRearGet = mUiParamsRearGet2;
            ObservableInt observableInt4 = mUiParamsRear;
            boolean mUiParamsRearInt1 = mUiParamsRearGet == 1;
            if ((dirtyFlags & 16384) != 0) {
                if (mUiParamsRearInt1) {
                    dirtyFlags |= 134217728;
                } else {
                    dirtyFlags |= 67108864;
                }
            }
            mUiParamsRearInt1ViewVISIBLEViewINVISIBLE = mUiParamsRearInt1 ? 0 : 4;
        } else {
            mUiParamsRightTempStrGet = mUiParamsRightTempStrGet4;
            javaLangStringMUiParamsWindSpeed = javaLangStringMUiParamsWindSpeed3;
            mUiParamsRearGet = 0;
        }
        if ((dirtyFlags & 4294967296L) != 0) {
            if (mUiParams != null) {
                mUiParamsLoopMode = mUiParams.loopMode;
            } else {
                mUiParamsLoopMode = null;
            }
            UiParams uiParams = mUiParams;
            updateRegistration(5, (Observable) mUiParamsLoopMode);
            if (mUiParamsLoopMode != null) {
                mUiParamsLoopModeGet = mUiParamsLoopMode.get();
            } else {
                mUiParamsLoopModeGet = 0;
            }
            int i4 = mUiParamsRearGet;
            mUiParamsLoopModeInt1 = true;
            if (mUiParamsLoopModeGet != 1) {
                mUiParamsLoopModeInt1 = false;
            }
            if ((dirtyFlags & 4294967296L) != 0) {
                if (mUiParamsLoopModeInt1) {
                    dirtyFlags |= 2097152;
                } else {
                    dirtyFlags |= 1048576;
                }
            }
            mUiParamsLoopModeInt1ViewVISIBLEViewINVISIBLE = mUiParamsLoopModeInt1 ? 0 : 4;
        } else {
            int i5 = mUiParamsRearGet;
            mUiParamsLoopMode = null;
            mUiParamsLoopModeInt1 = false;
            mUiParamsLoopModeGet = 0;
        }
        if ((dirtyFlags & 12432) != 0) {
            int i6 = mUiParamsLoopModeGet;
            mUiParamsLoopModeGet2 = mUiParamsFrontMistSwitchGet ? 4 : mUiParamsRearInt1ViewVISIBLEViewINVISIBLE;
        } else {
            int i7 = mUiParamsLoopModeGet;
            mUiParamsLoopModeGet2 = 0;
        }
        if ((dirtyFlags & 12448) != 0) {
            mUiParamsFrontMistSwitchViewINVISIBLEMUiParamsLoopModeInt1ViewVISIBLEViewINVISIBLE = mUiParamsFrontMistSwitchGet ? 4 : mUiParamsLoopModeInt1ViewVISIBLEViewINVISIBLE;
        }
        int mUiParamsFrontMistSwitchViewINVISIBLEMUiParamsLoopModeInt1ViewVISIBLEViewINVISIBLE2 = mUiParamsFrontMistSwitchViewINVISIBLEMUiParamsLoopModeInt1ViewVISIBLEViewINVISIBLE;
        if ((dirtyFlags & 12416) != 0) {
            ObservableInt observableInt5 = mUiParamsLoopMode;
            this.leftTempImage.setVisibility(mUiParamsFrontMistSwitchViewINVISIBLEViewVISIBLE);
            this.leftTempTextView.setVisibility(mUiParamsFrontMistSwitchViewINVISIBLEViewVISIBLE);
            this.textView4.setVisibility(mUiParamsFrontMistSwitchViewINVISIBLEViewVISIBLE);
            this.textView6.setVisibility(mUiParamsFrontMistSwitchViewINVISIBLEViewVISIBLE);
            this.textView8.setVisibility(mUiParamsFrontMistSwitchViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 12290) != 0) {
            this.leftTempImage.setImageLevel(mUiParamsLeftBlowingModeGet2);
        }
        if ((dirtyFlags & 12800) != 0) {
            TextViewBindingAdapter.setText(this.leftTempTextView, mUiParamsLeftTempStrGet2);
        }
        if ((dirtyFlags & 13312) != 0) {
            this.mboundView1.setVisibility(mUiParamsIsOpenViewVISIBLEViewGONE2);
            this.textView.setVisibility(mUiParamsIsOpenViewGONEViewVISIBLE2);
        }
        if ((dirtyFlags & 12296) != 0) {
            this.mboundView5.setVisibility(mUiParamsAutoSwitchViewVISIBLEViewGONE2);
            this.windSpeedTextView.setVisibility(mUiParamsAutoSwitchViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 12289) != 0) {
            this.textView2.setVisibility(mUiParamsMaxInt1ViewVISIBLEViewINVISIBLE2);
        }
        if ((dirtyFlags & 14336) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.textView4, mUiParamsAcStatusInt1TextView4AndroidDrawableNtg55AcOnTextView4AndroidDrawableNtg55AcOff2);
        }
        if ((dirtyFlags & 12448) != 0) {
            this.textView5.setVisibility(mUiParamsFrontMistSwitchViewINVISIBLEMUiParamsLoopModeInt1ViewVISIBLEViewINVISIBLE2);
        }
        if ((dirtyFlags & 12292) != 0) {
            this.textView6.setImageLevel(mUiParamsRightBlowingModeGet2);
        }
        if ((dirtyFlags & 12432) != 0) {
            this.textView7.setVisibility(mUiParamsLoopModeGet2);
        }
        if ((dirtyFlags & 12352) != 0) {
            int i8 = mUiParamsLoopModeGet2;
            mUiParamsRightTempStrGet2 = mUiParamsRightTempStrGet;
            TextViewBindingAdapter.setText(this.textView8, mUiParamsRightTempStrGet2);
        } else {
            int mUiParamsFrontMistSwitchViewINVISIBLEMUiParamsRearInt1ViewVISIBLEViewINVISIBLE = mUiParamsLoopModeGet2;
            mUiParamsRightTempStrGet2 = mUiParamsRightTempStrGet;
        }
        if ((dirtyFlags & 12544) != 0) {
            String str = mUiParamsRightTempStrGet2;
            TextViewBindingAdapter.setText(this.windSpeedTextView, javaLangStringMUiParamsWindSpeed);
            return;
        }
        String mUiParamsRightTempStrGet5 = javaLangStringMUiParamsWindSpeed;
    }
}
