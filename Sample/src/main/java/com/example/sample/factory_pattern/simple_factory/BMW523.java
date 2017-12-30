package com.example.sample.factory_pattern.simple_factory;

/**
 * author: sundong
 * created at 2017/4/19 15:11
 */

class BMW523 implements BMW {
    BMW523() {
        System.out.println("制造---->BMW523");
    }

    @Override
    public void move() {
        System.out.println("BMW523---->move");
    }
}
