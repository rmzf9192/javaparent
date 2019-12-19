package com.el.base.design.factory.simplefactory.pizza;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 10:28
 * @Version V1.0
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }
}