package com.el.base.design.singleton;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 8:44
 * @Version V1.0
 *   双端检索机制
 *   延迟加载，效率较高，推荐使用该种方式
 */
public class Singleton04 {

    private static volatile Singleton04 instance;

    public Singleton04() {
    }

    public static synchronized Singleton04 getInstance(){
        if (instance == null) {
            synchronized (Singleton04.class){
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }
}