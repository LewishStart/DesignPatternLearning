package com.example.sample.observer_pattern.jdk;

/**
 * author: sundong
 * created at 2017/4/26 16:05
 */

public class Client {
    public static void main(String[] args){
        WeatherSubject weatherObservedSubject = new WeatherSubject();
        ConcreteObserver xiaoming = new ConcreteObserver("小明", "打篮球");
        ConcreteObserver xiaohong = new ConcreteObserver("小红", "逛街");
        weatherObservedSubject.addObserver(xiaoming);
        weatherObservedSubject.addObserver(xiaohong);
        weatherObservedSubject.setWeatherContent("天气晴朗");
    }
}
