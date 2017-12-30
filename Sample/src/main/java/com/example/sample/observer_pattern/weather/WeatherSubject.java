package com.example.sample.observer_pattern.weather;


/**
 * author: sundong
 * created at 2017/4/26 15:28
 */

public class WeatherSubject extends Subject {
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void releaseWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        notifyObservers();
    }
}
