package com.example.sample.decorator_pattern;

/**
 * author: sundong
 * created at 2017/4/13 16:45
 */

public class Decorator implements ICar {
    protected ICar car;

    public Decorator(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
