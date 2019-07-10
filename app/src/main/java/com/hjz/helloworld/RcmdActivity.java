package com.hjz.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.hjz.helloworld.recycler.BaseAdapter;
import com.hjz.helloworld.recycler.Data;
import com.hjz.helloworld.recycler.DataFactory;

import java.util.Calendar;
import java.util.List;

public class RcmdActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private TextView headtext;
    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.layout_recycler);
        Calendar calendar = Calendar.getInstance();
        headtext = (TextView)findViewById(R.id.TV_1);
        int month = calendar.get(calendar.MONTH)+1;
        int day = calendar.get(calendar.DAY_OF_MONTH);
        headtext.setText("更新于 "+month+"月"+day+"日");
        mRecyclerView = (RecyclerView)findViewById(R.id.rv_list1);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        DataFactory d = new DataFactory();
        BaseAdapter<Data> mAdapter = new BaseAdapter<Data>(d.getData(9)){

            @Override
            public int getLayoutId(int viewType) {
                return R.layout.layout_item;
            }

            @Override
            public void bind(BaseHolder holder, Data data, int postion) {
                TextView v1 = holder.getView(R.id.rv_tv_1);
                String s = String.valueOf(data.getIndx()+1) + ". ";
                String t = String.valueOf(data.getWatch());
                v1.setText(s);
                if(data.getIndx()<3){
                    v1.setTextColor(Color.parseColor("#e6face15"));
                }
                if(data.getType()==1){
                    TextView v4 = holder.getView(R.id.rv_tv_hot);
                    v4.setText("热");
                }
                if(data.getType()==2){
                    TextView v5 = holder.getView(R.id.rv_tv_new);
                    v5.setText("新");
                }
                TextView v2 = holder.getView(R.id.rv_tv_2);
                v2.setText(data.getInfo());
                TextView v3 = holder.getView(R.id.rv_tv_3);
                v3.setText(t);

            }
        };

        mRecyclerView.setAdapter(mAdapter);
    }
}
