package com.el.base.design.factory.abstrafactor;

import com.el.base.design.factory.simplefactory.pizza.Pizza;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 10:59
 * @Version V1.0
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}