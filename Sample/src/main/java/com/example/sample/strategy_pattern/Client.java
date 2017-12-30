package com.example.sample.strategy_pattern;

/**
 * author: sundong
 * created at 2017/4/27 14:03
 */
public class Client {
    public static void main(String[] args){
        int a = 10,b = 2;
        AlgorithmContext algorithmContext = new AlgorithmContext();

        algorithmContext.setAlgorithm(new AddAlgorithm());
        algorithmContext.cal(a,b);

        algorithmContext.setAlgorithm(new SubAlgorithm());
        algorithmContext.cal(a,b);

        algorithmContext.setAlgorithm(new MultiplyAlgorithm());
        algorithmContext.cal(a,b);

        algorithmContext.setAlgorithm(new DivisionAlgorithm());
        algorithmContext.cal(a,b);

    }
}
