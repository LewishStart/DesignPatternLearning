package com.example.sample.factory_pattern.simple_factory;

/**
 * Created by Administrator on 2017/4/19 15:13.
 */

class BMWFactory {
    static final int BMW320 = 1;
    static final int BMW523 = 2;

    private static class SingletonHolder{
        private static final BMWFactory INSTANCE = new BMWFactory();
    }

    static BMWFactory getInstance(){
        return SingletonHolder.INSTANCE;
    }

     BMW createBMWCAR(int bwwType){
        BMW car = null;
        switch (bwwType) {
            case  BMW320:
                car = new BMW320();
                break;
            case  BMW523:
                car = new BMW523();
                break;
        }
        return car;
    }
}
