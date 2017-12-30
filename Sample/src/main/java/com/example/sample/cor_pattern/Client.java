package com.example.sample.cor_pattern;


import com.example.sample.cor_pattern.handler.PriceHandlerFactory;

import java.util.Random;

/**
 * author: sundong
 * created at 2017/4/27 14:41
 */

public class Client {
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.getInstance().createPriceHandler());
        Random rand = new Random();

        for(int i=1;i<=100;i++){
            System.out.print(i+":");
            customer.requestDiscount(rand.nextFloat());
        }
    }
}
