package com.hjz.helloworld.recycler;

public class Data {
    private String info;
    private int indx;
    private int watch;
    private int type;
    public Data(String info,int indx, int watch, int type){
        this.info = info;
        this.indx = indx;
        this.watch = watch;
        this.type = type;
    }
    public void setData(String info, int indx, int watch, int type){ this.info = info; this.indx = indx; this.watch = watch; this.type = type;}
    public String getInfo(){return this.info;}
    public int getIndx(){return this.indx;}
    public int getWatch(){return this.watch;}
    public int getType(){return this.type;}
}
