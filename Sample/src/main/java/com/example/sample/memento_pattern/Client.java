package com.example.sample.memento_pattern;

/**
 * author: sundong
 * created at 2017/5/17 15:58
 */

public class Client {
    public static void main(String[] args){
        CallOfDutyGame callOfDutyGame = new CallOfDutyGame();
        callOfDutyGame.playGame();
        CareTaker.getInstance().setMemoto(callOfDutyGame.createMemoto());
        callOfDutyGame.quitGame();
        callOfDutyGame.restoreMemoto(CareTaker.getInstance().getMemoto());
        callOfDutyGame.playGame();
    }
}
