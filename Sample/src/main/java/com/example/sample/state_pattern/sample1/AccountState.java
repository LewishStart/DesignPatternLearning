package com.example.sample.state_pattern.sample1;

/**
 * author: sundong
 * created at 2017/5/18 16:45
 */
public abstract class AccountState {
    protected Account acc;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void computeInterest();

    public abstract void stateCheck();
}
