package com.el.base.design.factory.simplefactory;

import com.el.base.design.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 10:39
 * @Version V1.0
 */
public class OrderPizza {

    private SimpleFactory simpleFactory;

    private Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory factory){
        String type = "";

        this.simpleFactory  = factory;

        do{
            type = getType();
            pizza = simpleFactory.createPizza(type);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购pizza失败");
                break;
            }
        }while (true);

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