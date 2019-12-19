package com.el.base.design.singleton;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 9:00
 * @Version V1.0
 *   单例模式使用场景：
 *     频繁创建和销毁的对象，创建对象耗时过多或者耗费资源过多，但又经常使用的对象，
 *     工具类对象，访问数据库或文件的对象
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton06 intance = Singleton06.INTANCE;
        Singleton06 intance1 = Singleton06.INTANCE;

        System.out.println(intance == intance1);

        System.out.println(intance.hashCode());
        System.out.println(intance1.hashCode());
    }
}