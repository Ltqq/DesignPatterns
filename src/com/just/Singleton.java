package com.just;

public class Singleton {

    private volatile static  Singleton instance = null;
    public Singleton(){};
    public static Singleton getInstance(){
        if(instance ==null){
            synchronized(Singleton.class){
                if(instance ==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
