package com.example.sample.factory_pattern.factory_method;

/**
 * author: sundong
 * created at 2017/4/19 15:11
 */


class BMW320 implements BMW {
    BMW320() {
        System.out.println("制造---->BMW320");
    }

    @Override
    public void move() {
        System.out.println("BMW320---->move");
    }
}
