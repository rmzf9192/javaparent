package com.el.base.design.singleton;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 8:50
 * @Version V1.0
 *  利用类在被装载时不会实例化，而是在需要实例化的时候，调用对应方法，才会装载对应的静态内部类，从而完成对应的类的实例化.
 *  避免了线程不安全，利用静态内部类的特点实现延迟加载，效率高
 */
public class Singleton05 {
    private static volatile Singleton05 instance;

    private Singleton05() {
    }

    private static class SingletonInstance{
        private static final Singleton05 INSTANCE = new Singleton05();
    }

    public static Singleton05 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}