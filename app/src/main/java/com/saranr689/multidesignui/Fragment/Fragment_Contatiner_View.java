package com.saranr689.multidesignui.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.saranr689.multidesignui.I_ChangeFragment;
import com.saranr689.multidesignui.R;

/**
 * Created by lakeba01 on 20/3/17.
 */

public class Fragment_Contatiner_View extends Fragment {

    View view;
    ImageView fornt_imageview,back_imageview,right_imageview,left_imageview;
    I_ChangeFragment i_changeFragment;

    public Fragment_Contatiner_View() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragments_container,container,false);
        
        fornt_imageview = (ImageView)view.findViewById(R.id.forntview_id);
        back_imageview = (ImageView)view.findViewById(R.id.backview_id);
        right_imageview = (ImageView)view.findViewById(R.id.rightview_id);
        left_imageview = (ImageView)view.findViewById(R.id.leftview_id);


        fornt_imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i_changeFragment.chageFragment_ForntView();
            }
        });

        back_imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i_changeFragment.chageFragment_backView();
            }
        });
        right_imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i_changeFragment.chageFragment_rightView();
            }
        });

        left_imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i_changeFragment.chageFragment_leftView();
            }
        });




        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        i_changeFragment = (I_ChangeFragment)context;
    }
}
