package com.example.sample.strategy_pattern;

/**
 * author: sundong
 * created at 2017/4/27 13:57
 */
public class MultiplyAlgorithm implements Algorithm {
    @Override
    public int calculate(int x, int y) {
        System.out.println(x+"*"+y+"="+(x*y));
        return x*y;
    }
}
