package com.example.sample.decorator_pattern;

/**
 * author: sundong
 * created at 2017/4/13 16:47
 */

public class WaterCar extends Decorator {
    public WaterCar(ICar car) {
        super(car);
    }
    public void swim(){
        System.out.println("水中行驶");
    }
    @Override
    public void move() {
        super.move();
        swim();
    }
}
