package com.example.sample.observer_pattern.weather;

/**
 * author: sundong
 * created at 2017/4/26 15:34
 */

public class Client {
    public static void main(String[] args){
        WeatherSubject weatherObservedSubject = new WeatherSubject();
        ConcreteObserver xiaoming = new ConcreteObserver("小明", "打篮球");
        ConcreteObserver xiaohong = new ConcreteObserver("小红", "逛街");
        weatherObservedSubject.attachObserver(xiaoming);
        weatherObservedSubject.attachObserver(xiaohong);
        weatherObservedSubject.releaseWeatherContent("天气很好");
    }
}
