package com.example.sample.decorator_pattern;

/**
 * author: sundong
 * created at 2017/4/13 16:49
 */

public class Client {
    public static void main(String[] args){
        ConcreteCar concreteCar = new ConcreteCar();
        concreteCar.move();

        System.out.println("----添加空中行驶功能----");
        FlyCar flyCar = new FlyCar(concreteCar);
        flyCar.move();

        System.out.println("----添加水中行驶功能----");
        WaterCar waterCar = new WaterCar(concreteCar);
        waterCar.move();
    }
}
