package com.example.sample.factory_pattern.factory_method;

/**
 * author: sundong
 * created at 2017/4/19 15:46
 */
public class client {
    public static void main(String[] args){
//        /**
//         * 改进工厂模式前
//         */
//        BMW bmw320 = BMW320Factory.getInstance().createBMW();
//        BMW bmw523 = BMW523Factory.getInstance().createBMW();
//
//        bmw320.move();
//        bmw523.move();
        /**
         * 改进工厂模式后
         */
        BMW320 bmw320 = ImprovedBMWFactory.getInstance().createBMW(BMW320.class);
        BMW523 bmw523 = ImprovedBMWFactory.getInstance().createBMW(BMW523.class);

        bmw320.move();
        bmw523.move();
    }
}
