package com.example.sample.state_pattern.sample2;

/**
 * author: sundong
 * created at 2017/5/18 16:53
 */
public class Client {
    public static void main(String args[]) {
        Screen screen = new Screen();
        screen.onClick();
        screen.onClick();
        screen.onClick();
    }
}
