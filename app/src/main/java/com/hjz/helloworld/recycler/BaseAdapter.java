package com.hjz.helloworld.recycler;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public abstract class BaseAdapter<T> extends RecyclerView.Adapter<BaseAdapter.BaseHolder> {
    private List<T> mlist;
    //模板数据初始化
    public BaseAdapter(List<T> data){
        mlist = data;
    }
    //定义抽象函数由具体adapter重载实现
    public abstract int getLayoutId(int viewType);
    public abstract void bind(BaseHolder holder, T data, int postion);
    @NonNull
    @Override
    public BaseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return BaseHolder.get(parent,getLayoutId(viewType));
    }

    @Override
    public void onBindViewHolder(@NonNull BaseHolder holder, int position) {
        bind(holder,mlist.get(position),position);
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public void setMlist(List<T> inlist){
        mlist = inlist;
    }

    //重新构建ViewHolder
    public static class BaseHolder extends RecyclerView.ViewHolder{
        private SparseArray<View> mViews;
        private View mCounterView;


        public BaseHolder(@NonNull View itemView) {
            super(itemView);
            mCounterView = itemView;
            mViews = new SparseArray<>();
        }

        public static BaseHolder get(ViewGroup parent, int layoutId){
            View couterView = LayoutInflater.from(parent.getContext()).inflate(layoutId,parent,false);
            return new BaseHolder(couterView);
        }

        public <T extends View> T getView(int id){
            View v = mViews.get(id);
            if(v == null){
                v = mCounterView.findViewById(id);
                mViews.put(id,v);
            }
            return (T)v;
        }
    }
}
