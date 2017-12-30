package com.example.sample.factory_pattern.factory_method;



/**
 * Created by Administrator on 2017/4/19 15:38.
 */

class BMW320Factory implements BMWFactory {
    private static class SingletonHolder{
        private static final BMW320Factory INSTANCE = new BMW320Factory();
    }
    public static BMW320Factory getInstance(){
        return SingletonHolder.INSTANCE;
    }
    @Override
    public BMW createBMW() {
        return new BMW320();
    }
}
