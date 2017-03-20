package com.saranr689.multidesignui.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saranr689.multidesignui.R;

/**
 * Created by lakeba01 on 20/3/17.
 */

public class Fragment_leftView extends Fragment{

    View rootView;
    public Fragment_leftView() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_leftview_layout,container,false);
        return rootView;
    }
}
