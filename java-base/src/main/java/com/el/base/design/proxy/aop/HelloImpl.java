package com.el.base.design.proxy.aop;

/**
 * @Auther: roman.zhang
 * @Date: 2019/4/13 10:53
 * @Version:V1.0
 * @Description:HelloImpl
 */
public class HelloImpl  extends Hello{
    public static void me(){
        System.out.println("吱吱");
    }

    public void test(){
        System.out.println("测试");
    }

    public static void main(String[] args) {
        Hello hello = new HelloImpl();

        me();
    }
}
