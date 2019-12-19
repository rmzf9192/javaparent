package com.el.base.design.decorator.test;

/**
 * @author roman zhangfei
 * @Date 2019/11/12 11:38
 * @Version V1.0
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
