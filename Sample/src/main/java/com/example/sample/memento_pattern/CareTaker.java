package com.example.sample.memento_pattern;

/**
 * author: sundong
 * created at 2017/5/17 15:52
 */

public class CareTaker {
    private static class SingletonHolder{
        private static CareTaker INSTANCE = new CareTaker();
    }
    public static CareTaker getInstance(){
        return SingletonHolder.INSTANCE;
    }
    private Memoto memoto;

    public Memoto getMemoto() {
        return memoto;
    }

    public void setMemoto(Memoto memoto) {
        this.memoto = memoto;
    }
}
