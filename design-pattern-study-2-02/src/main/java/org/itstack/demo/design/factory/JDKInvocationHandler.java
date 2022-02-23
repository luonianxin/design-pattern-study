package org.itstack.demo.design.factory;

import org.itstack.demo.design.util.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *  jdk动态代理核心处理器
 */
public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter adapter;

    public JDKInvocationHandler(ICacheAdapter adapter){
        this.adapter = adapter;
    }

    /**
     * Processes a method invocation on a proxy instance and returns
     * the result.  This method will be invoked on an invocation handler
     * when a method is invoked on a proxy instance that it is
     * associated with.
     * 注意此处调用方法时参数不可多传，否则极易报错参数数量不匹配
     *
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(adapter,args);
    }
}
