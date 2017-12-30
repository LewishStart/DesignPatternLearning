package com.example.sample.factory_pattern.simple_factory;

/**
 * author: sundong
 * created at 2017/4/19 15:21
 */

public class Client {
    public static void main(String[] args){
        BMW bmw320 = BMWFactory.getInstance().createBMWCAR(BMWFactory.BMW320);
        bmw320.move();

        BMW bmw523 = BMWFactory.getInstance().createBMWCAR(BMWFactory.BMW523);
        bmw523.move();
    }
}
