package com.el.base.design.singleton;

/**
 * @author roman zhangfei
 * @Date 2019/12/17 16:35
 * @Version V1.0
 *   饿汉式（静态变量）：这种模式可用，但有可能造成内存浪费
 */
public class Singleton {
    //构造方法私有化
    private Singleton() {

    }

    private final static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}