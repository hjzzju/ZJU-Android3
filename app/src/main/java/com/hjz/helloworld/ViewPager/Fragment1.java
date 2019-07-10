package com.hjz.helloworld.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hjz.helloworld.R;


public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        Log.d(TAG, "onCreateView() called with: inflater = [" + inflater + "], container = [" + container + "], savedInstanceState = [" + savedInstanceState + "]");
        View v = inflater.inflate(R.layout.layout_fragment_1,container,false);
        TextView tv0 = v.findViewById(R.id.FL_TV_1);
        tv0.setText("Alpha Animation");
        tv0.startAnimation(AnimationUtils.loadAnimation(v.getContext(),R.anim.alphaanimation));
        TextView tv1 = v.findViewById(R.id.FL_TV_1_1);
        tv1.setText("Scale Animation");
        tv1.startAnimation(AnimationUtils.loadAnimation(v.getContext(),R.anim.scaleanimation));
        TextView tv2 = v.findViewById(R.id.FL_TV_1_2);
        tv2.setText("Animation Set");
        AnimationSet anim = new AnimationSet(true);
        anim.addAnimation(AnimationUtils.loadAnimation(v.getContext(),R.anim.alphaanimation));
        anim.addAnimation(AnimationUtils.loadAnimation(v.getContext(),R.anim.scaleanimation));
        tv2.startAnimation(anim);
        return v;
    }
}
