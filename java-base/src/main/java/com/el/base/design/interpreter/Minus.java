package com.el.base.design.interpreter;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/3 17:28
 * @Version:V1.0
 * @Description:Minus
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
