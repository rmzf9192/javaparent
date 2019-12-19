package com.el.base.design.adapter;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 15:18
 * @Version V1.0
 */
public class Phone {

    //充电
    public void charging(IVOltage5v ivOltage5v){
        if (ivOltage5v.input5v()==5) {
            System.out.println("输出电压为5v,可以充电");
        }else if(ivOltage5v.input5v() > 5){
            System.out.println("输出电压大于5v,不可以充电");
        }
    }
}