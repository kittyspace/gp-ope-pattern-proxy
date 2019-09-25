package com.opelyan.pattern.proxy.jkddynamicproxy;

import java.lang.reflect.Method;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/9/25 11:09
 */
public interface GInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
