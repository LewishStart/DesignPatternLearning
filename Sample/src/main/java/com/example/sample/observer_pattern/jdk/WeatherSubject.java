package com.example.sample.observer_pattern.jdk;

import java.util.Observable;

/**
 * author: sundong
 * created at 2017/4/26 16:00
 */

public class WeatherSubject extends Observable {
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.setChanged();
        this.notifyObservers();
    }
}
