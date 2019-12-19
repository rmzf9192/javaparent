package com.el.base.design.responsibilityofchain;

/**
 * @Auther: roman.zhang
 * @Date: 2019/1/3 15:37
 * @Version:V1.0
 * @Description:MyHandler
 */
public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + ":deal");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
