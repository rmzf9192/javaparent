package com.el.base.design.adapter;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 15:22
 * @Version V1.0
 *  被适配的类
 */
public class VOltage220v {
    public int  output220v(){
        int src = 220;

        System.out.println("输出电压为："+src);

        return src;
    }
}