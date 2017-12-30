package com.example.sample.cor_pattern.handler;

/**
 * author: sundong
 * created at 2017/4/27 14:31
 */


public class CEO extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount>0.5&&discount<0.7) {
            System.out.println(this.getClass().getSimpleName()+"批准了折扣:"+discount);
        }else {
            System.out.println(this.getClass().getSimpleName()+"驳回了折扣:"+discount);
        }
    }
}
