package com.el.base.design.prototype;

import lombok.Data;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 11:13
 * @Version V1.0
 */
@Data
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address = "蒙古羊";
    public Sheep friend; //是对象, 克隆是会如何处理

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Object clone(){
        Object clone = null;
        try {
          clone = super.clone();
            System.out.println("克隆出来的东东："+clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}