package com.example.sample.cor_pattern;


import com.example.sample.cor_pattern.handler.PriceHandler;

/**
 * author: sundong
 * created at 2017/4/27 14:41
 */

public class Customer {
    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount) {
        if(priceHandler==null) {
            throw new RuntimeException("请设置priceHandler");
        }else {
            priceHandler.processDiscount(discount);
        }
    }
}
