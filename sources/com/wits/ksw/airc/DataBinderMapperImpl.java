package com.wits.ksw.airc;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.wits.ksw.airc.databinding.AircShowViewBindingImpl;
import com.wits.ksw.airc.databinding.AircShowViewBindingSw600dpMdpiImpl;
import com.wits.ksw.airc.databinding.LexusAircShowViewBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(2);
    private static final int LAYOUT_AIRCSHOWVIEW = 1;
    private static final int LAYOUT_LEXUSAIRCSHOWVIEW = 2;

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.airc_show_view, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.lexus_airc_show_view, 2);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
        int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
        if (localizedLayoutId <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (localizedLayoutId) {
                case 1:
                    if ("layout-sw600dp-mdpi/airc_show_view_0".equals(tag)) {
                        return new AircShowViewBindingSw600dpMdpiImpl(component, view);
                    }
                    if ("layout/airc_show_view_0".equals(tag)) {
                        return new AircShowViewBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for airc_show_view is invalid. Received: " + tag);
                case 2:
                    if ("layout/lexus_airc_show_view_0".equals(tag)) {
                        return new LexusAircShowViewBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for lexus_airc_show_view is invalid. Received: " + tag);
                default:
                    return null;
            }
        } else {
            throw new RuntimeException("view must have a tag");
        }
    }

    public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
        if (views == null || views.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId) <= 0 || views[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int getLayoutId(String tag) {
        Integer tmpVal;
        if (tag == null || (tmpVal = InnerLayoutIdLookup.sKeys.get(tag)) == null) {
            return 0;
        }
        return tmpVal.intValue();
    }

    public String convertBrIdToString(int localId) {
        return InnerBrLookup.sKeys.get(localId);
    }

    public List<DataBinderMapper> collectDependencies() {
        ArrayList<DataBinderMapper> result = new ArrayList<>(1);
        result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
        return result;
    }

    private static class InnerBrLookup {
        static final SparseArray<String> sKeys = new SparseArray<>(4);

        private InnerBrLookup() {
        }

        static {
            sKeys.put(0, "_all");
            sKeys.put(1, "mUiParams");
            sKeys.put(2, "viewModel");
        }
    }

    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys = new HashMap<>(3);

        private InnerLayoutIdLookup() {
        }

        static {
            sKeys.put("layout-sw600dp-mdpi/airc_show_view_0", Integer.valueOf(R.layout.airc_show_view));
            sKeys.put("layout/airc_show_view_0", Integer.valueOf(R.layout.airc_show_view));
            sKeys.put("layout/lexus_airc_show_view_0", Integer.valueOf(R.layout.lexus_airc_show_view));
        }
    }
}
