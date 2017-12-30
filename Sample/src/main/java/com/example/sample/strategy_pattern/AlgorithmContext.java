package com.example.sample.strategy_pattern;

/**
 * author: sundong
 * created at 2017/4/27 14:00
 */

public class AlgorithmContext {
    private Algorithm algorithm;

    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public int cal(int x,int y){
        if(algorithm!=null) {
           return algorithm.calculate(x,y);
        }else {
            throw new RuntimeException("请设置算法");
        }
    }
}
