package com.example.sample.decorator_pattern;

/**
 * author: sundong
 * created at 2017/4/13 16:46
 */

public class FlyCar extends Decorator {
    public FlyCar(ICar car) {
        super(car);
    }
    public void fly(){
        System.out.println("空中行驶");
    }
    @Override
    public void move(){
        super.move();
        fly();
    }
}
