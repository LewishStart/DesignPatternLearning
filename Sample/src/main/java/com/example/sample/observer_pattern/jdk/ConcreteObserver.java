package com.example.sample.observer_pattern.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * author: sundong
 * created at 2017/4/26 16:01
 */

public class ConcreteObserver implements Observer {
    private String observerName;
    private String weatherContent;
    private String remindContent;

    public ConcreteObserver(String observerName,String remindContent) {
        this.observerName = observerName;
        this.remindContent = remindContent;
    }

    @Override
    public void update(Observable observable, Object o) {
        if(o!=null) {
            this.weatherContent = (String) o;
            System.out.println("推模型:"+observerName + "收到天气内容:" + this.weatherContent + "," + remindContent);
        }else {
            WeatherSubject weatherSubject = (WeatherSubject) observable;
            this.weatherContent = weatherSubject.getWeatherContent();
            System.out.println("拉模型:"+observerName + "收到天气内容:" + this.weatherContent + "," + remindContent);
        }
    }
}
