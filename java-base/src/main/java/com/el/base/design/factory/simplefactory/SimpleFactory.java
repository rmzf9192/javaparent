package com.el.base.design.factory.simplefactory;

import com.el.base.design.factory.simplefactory.pizza.CheesePizza;
import com.el.base.design.factory.simplefactory.pizza.GreekPizza;
import com.el.base.design.factory.simplefactory.pizza.PepperPizza;
import com.el.base.design.factory.simplefactory.pizza.Pizza;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 10:25
 * @Version V1.0
 */
public class SimpleFactory {

    //使用简单工厂模式
    public Pizza createPizza(String type){
        Pizza  pizza = null;

        if (type.equals("greek")) {
            pizza = new GreekPizza();
        }else if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("pepper")){
            pizza = new PepperPizza();
        }
        return pizza;
    }

    public static Pizza createPizza2(String type){
        Pizza  pizza = null;

        if (type.equals("greek")) {
            pizza = new GreekPizza();
        }else if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("pepper")){
            pizza = new PepperPizza();
        }
        return pizza;
    }
}