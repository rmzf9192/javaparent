package com.el.base.design.proxy.aop;

import java.lang.reflect.Method;

/**
 * @Auther: roman.zhang
 * @Date: 2019/4/12 9:53
 * @Version:V1.0
 * @Description:ILogger
 */
public interface ILogger {
    public void start(Method method);
    public void end(Method method);
}
