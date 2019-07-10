package com.hjz.helloworld.recycler;

import java.util.ArrayList;
import java.util.List;

public class DataFactory {
    private List<Data> mdata = new ArrayList<>();
    private final String[] TITLES = {"敬礼我的超级英雄", "我们不一Young", "珍\"eye\"每一天", "请平安出行", "现在是怀旧时间", "纸短情长", "田馥甄"
    ,"我们一起学猫叫", "轻轻牵着你的耳朵"};
    private final int[] WATCTES = {548583,504189,486636,301982,301928,299192,291049,289759,279973};
    private final int[] TYPES = {1,0,0,0,0,2,1,0,0};
    private int DEFAULT = 10;

    public List<Data> getData(int size){
        if(size > 10){
            size = 10;
        }

        for(int i=0;i<size;++ i){
            mdata.add(new Data(TITLES[i],i,WATCTES[i],TYPES[i]));
        }

        return mdata;
    }

}
