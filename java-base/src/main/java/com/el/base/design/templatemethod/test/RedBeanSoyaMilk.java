package com.el.base.design.templatemethod.test;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 17:10
 * @Version V1.0
 */
public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入上好的红豆");
    }
}