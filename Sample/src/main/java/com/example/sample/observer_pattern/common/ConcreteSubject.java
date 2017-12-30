package com.example.sample.observer_pattern.common;

/**
 * author: sundong
 * created at 2017/4/26 15:13
 */

public class ConcreteSubject extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        notifyObservers();
    }
}
