package com.el.base.design.factory.simplefactory;

import com.el.base.design.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 10:48
 * @Version V1.0
 */
public class OrderPizza2 {
    private Pizza pizza;

    String type= "";
    public OrderPizza2() {
        do{
            type = getType();
            pizza = SimpleFactory.createPizza2(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购pizza失败");
                break;
            }
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