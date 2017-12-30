package com.example.sample.cor_pattern.handler;

/**
 * author: sundong
 * created at 2017/4/27 14:27
 */
public class SalesLead extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount<=0.15) {
            System.out.println(this.getClass().getSimpleName()+"批准了折扣:"+discount);
        }else {
            successor.processDiscount(discount);
        }
    }
}
