package com.example.sample.cor_pattern.handler;

/**
 * author: sundong
 * created at 2017/4/27 14:21
 */

public abstract class PriceHandler {
    /**
     * 直接后继,用于传递请求
     */
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理折扣请求
     */
    public abstract void processDiscount(float discount);
}
