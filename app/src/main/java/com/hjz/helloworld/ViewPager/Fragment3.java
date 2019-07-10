package com.hjz.helloworld.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hjz.helloworld.R;

public class Fragment3 extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        Log.d(TAG, "onCreateView() called with: inflater = [" + inflater + "], container = [" + container + "], savedInstanceState = [" + savedInstanceState + "]");
        View v = inflater.inflate(R.layout.layout_fragment_3,container,false);
        TextView tv = v.findViewById(R.id.FL_TV_3);
        //Log.d("yyyhjz", "onCreateView: 3");
        tv.setText("Fragment3");
        return v;
    }
}
