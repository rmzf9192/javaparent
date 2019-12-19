package com.el.base.design.singleton;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 8:58
 * @Version V1.0
 *  利用枚举实现单例模式
 */
public enum Singleton06 {

    INTANCE;

    public void sayOk(){
        System.out.println("hello enum is sayOk()");
    }
}
