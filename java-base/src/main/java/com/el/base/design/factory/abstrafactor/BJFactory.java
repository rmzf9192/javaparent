package com.el.base.design.factory.abstrafactor;

import com.el.base.design.factory.simplefactory.pizza.Pizza;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 10:58
 * @Version V1.0
 */
public class BJFactory extends OrderPizza {
    @Override
    Pizza createPizza(String type) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (type.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}