package com.example.sample.observer_pattern.common;

/**
 * author: sundong
 * created at 2017/4/26 15:18
 */

public class Client {
    public static void main(String[] args){
        ConcreteSubject concreteObservedSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver();
        concreteObservedSubject.attachObserver(concreteObserver);
        concreteObservedSubject.setSubjectState("哈哈");
    }
}
