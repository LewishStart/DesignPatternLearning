package com.example.sample.observer_pattern.weather;


/**
 * author: sundong
 * created at 2017/4/26 15:29
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
    public void update(Subject subject) {
        this.weatherContent = ((WeatherSubject) subject).getWeatherContent();
        System.out.println(observerName + "收到天气内容:" + weatherContent + "," + remindContent);
    }
}
