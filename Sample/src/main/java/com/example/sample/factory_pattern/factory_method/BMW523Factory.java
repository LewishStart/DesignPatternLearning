package com.example.sample.factory_pattern.factory_method;


/**
 * Created by Administrator on 2017/4/19 15:45.
 */

public class BMW523Factory implements BMWFactory {
    private static class SingletonHolder{
        private static final BMW523Factory INSTANCE = new BMW523Factory();
    }
    public static BMW523Factory getInstance(){
        return SingletonHolder.INSTANCE;
    }
    @Override
    public BMW createBMW() {
        return new BMW523();
    }
}
