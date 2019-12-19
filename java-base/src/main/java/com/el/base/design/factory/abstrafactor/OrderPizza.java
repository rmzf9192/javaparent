package com.el.base.design.factory.abstrafactor;

import com.el.base.design.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 10:54
 * @Version V1.0
 */
public abstract class OrderPizza {

    abstract Pizza createPizza(String type);

    public OrderPizza() {
        Pizza pizza = null;

        String type = getType();

        do{
            pizza =  createPizza(type);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }

    //获取输入的值
    public String getType(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("输入披萨种类：");

            String s = reader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}