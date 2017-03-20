package com.saranr689.multidesignui.activity;

import android.os.Bundle;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.saranr689.multidesignui.Fragment.Fragment_Contatiner_View;
import com.saranr689.multidesignui.Fragment.Fragment_backView;
import com.saranr689.multidesignui.Fragment.Fragment_forntView;
import com.saranr689.multidesignui.Fragment.Fragment_leftView;
import com.saranr689.multidesignui.Fragment.Fragment_rightView;
import com.saranr689.multidesignui.I_ChangeFragment;
import com.saranr689.multidesignui.R;

public class MainActivity extends AppCompatActivity implements I_ChangeFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container1,new Fragment_Contatiner_View(),"fragment1");
        fragmentTransaction.replace(R.id.container2,new Fragment_forntView(),"forntview_fragment");
        fragmentTransaction.commit();

    }

    @Override
    public void chageFragment_ForntView() {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container2,new Fragment_forntView(),"forntview_fragment");
        fragmentTransaction.commit();
    }

    @Override
    public void chageFragment_backView() {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container2,new Fragment_backView(),"backview_fragment");
        fragmentTransaction.commit();
    }

    @Override
    public void chageFragment_leftView() {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container2,new Fragment_leftView(),"leftview_fragment");
        fragmentTransaction.commit();
    }

    @Override
    public void chageFragment_rightView() {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container2,new Fragment_rightView(),"rightview_fragment");
        fragmentTransaction.commit();
    }
}
