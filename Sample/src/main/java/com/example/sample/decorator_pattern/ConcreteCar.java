package com.example.sample.decorator_pattern;

/**
 * author: sundong
 * created at 2017/4/13 16:43
 */

public class ConcreteCar implements ICar {
    @Override
    public void move() {
        System.out.println("路上行驶");
    }
}
