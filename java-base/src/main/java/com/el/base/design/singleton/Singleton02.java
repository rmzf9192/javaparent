package com.el.base.design.singleton;

/**
 * @author roman zhangfei
 * @Date 2019/12/17 16:51
 * @Version V1.0
 * 饿汉式（静态代码块）:这种模式可用，但有可能造成内存浪费
 */
public class Singleton02 {

    private Singleton02() {
    }

    private static Singleton02 singleton;

    static{
        singleton = new Singleton02();
    }

    public static Singleton02 getInstance(){
        return singleton;
    }
}