package com.example.vas.dinamicfragmenttest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.vas.dinamicfragmenttest.fragment.OneFragment;
import com.example.vas.dinamicfragmenttest.fragment.TwoFragment;

/**
 * Created by vas on 22-Dec-14.
 */
public class MainActivity extends FragmentActivity {

    private OneFragment oneFragment = new OneFragment();
    private TwoFragment twoFragment = new TwoFragment();
    private FragmentManager manager;
    private FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        manager = getSupportFragmentManager();
        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();
    }

    public void onClickFragment(View view){
        transaction = manager.beginTransaction();

        switch (view.getId()){
            case R.id.btnAdd:
                transaction.add(R.id.container, oneFragment);
                break;
        }
        transaction.commit();
    }
}
