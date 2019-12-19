package com.el.base.design.singleton;

/**
 * @author roman zhangfei
 * @Date 2019/12/17 16:55
 * @Version V1.0
 * 懒汉式：起到了lazy loading的效果，但是只能在单线程下使用，存在线程安全
 *  实际中禁止使用该种模式
 */
public class Singleton03 {

    private Singleton03() {
    }

    private static Singleton03 singleton;

   /* public static Singleton03 getInstance(){
        if (singleton == null) {
            singleton = new Singleton03();
        }
        return singleton;
    }*/

    /**
     * 同步方法的方式解决线程安全问题
     *  该方法；同步方法代码块的方式获取实例，方法进行同步效率太低
     * @return
     */
    public static synchronized Singleton03 getInstance(){
        if (singleton == null) {
            singleton = new Singleton03();
        }
        return singleton;
    }


    /**
     * 同步代码块：存在线程安全问题 不推荐使用
     * @return
     */
    public static  Singleton03 getInstance1(){
        if (singleton == null) {
            synchronized(Singleton03.class){
                singleton = new Singleton03();
            }
        }
        return singleton;
    }

}