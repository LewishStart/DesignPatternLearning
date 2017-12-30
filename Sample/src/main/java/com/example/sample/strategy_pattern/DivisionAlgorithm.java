package com.example.sample.strategy_pattern;

/**
 * author: sundong
 * created at 2017/4/27 14:03
 */

public class DivisionAlgorithm implements Algorithm {
    @Override
    public int calculate(int x, int y) {
        if(y==0) {
            throw new RuntimeException("除数不为零");
        }else {
            System.out.println(x+"/"+y+"="+(x/y));
            return x/y;
        }
    }
}
