package com.el.base.design.interpreter.test;

import java.util.HashMap;

/**
 * @author Roman.zhang
 * @Date: 2019/7/9 11:38
 * @Version:V1.0
 * @Description:AddExpression
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String,Integer> var){
        System.out.println( super.left.interpreter(var));;
        System.out.println( super.right.interpreter(var));;
        super.right.interpreter(var);

        return super.left.interpreter(var)+super.right.interpreter(var);
    }
}
