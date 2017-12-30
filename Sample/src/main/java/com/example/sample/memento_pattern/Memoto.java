package com.example.sample.memento_pattern;

/**
 * author: sundong
 * created at 2017/5/17 15:50
 */

public class Memoto {
    private int mCheckPoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    public int getmCheckPoint() {
        return mCheckPoint;
    }

    public void setmCheckPoint(int mCheckPoint) {
        this.mCheckPoint = mCheckPoint;
    }

    public int getmLifeValue() {
        return mLifeValue;
    }

    public void setmLifeValue(int mLifeValue) {
        this.mLifeValue = mLifeValue;
    }

    public String getmWeapon() {
        return mWeapon;
    }

    public void setmWeapon(String mWeapon) {
        this.mWeapon = mWeapon;
    }

    @Override
    public String toString() {
        return "Memoto{" +
                "mCheckPoint=" + mCheckPoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
