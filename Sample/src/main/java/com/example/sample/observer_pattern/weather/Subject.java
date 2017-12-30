package com.example.sample.observer_pattern.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * author: sundong
 * created at 2017/4/26 15:12
 */

public class Subject {
    private List<Observer> observerList = new ArrayList<>();

    protected void attachObserver(Observer observer){
        if(!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    protected void detachObserver(Observer observer){
        if(observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    protected void notifyObservers(){
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
}
