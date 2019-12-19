package com.el.base.design.factory.simplefactory.pizza;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 10:28
 * @Version V1.0
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料 ");
    }
}