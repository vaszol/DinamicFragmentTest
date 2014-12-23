package com.example.vas.dinamicfragmenttest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vas.dinamicfragmenttest.R;

import java.util.zip.Inflater;

/**
 * Created by vas on 23-Dec-14.
 */
public class OneFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.one_fragment,null);
    }
}
