package com.example.sample.observer_pattern.common;

/**
 * author: sundong
 * created at 2017/4/26 15:13
 */

public class ConcreteObserver implements Observer {
    private String subjectState;
    @Override
    public void update(Subject subject) {
        ConcreteSubject concreteObservedSubject = (ConcreteSubject) subject;
        this.subjectState = concreteObservedSubject.getSubjectState();
        System.out.println("subjectState:"+subjectState+"状态更新了");
    }
}
