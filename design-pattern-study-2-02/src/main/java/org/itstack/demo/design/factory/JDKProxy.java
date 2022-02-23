package org.itstack.demo.design.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKProxy {

    /**
     *  获取对应的代理类
     * @param interfaceClass 接口类
     * @param cacheAdapter 具体的适配器实现类
     * @return 代理对象
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) throws Exception {
        // 1. 创建处理器对象
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        // 2. 获取类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        // 3. 获取接口类
        Class<?>[] interfaces = interfaceClass.getInterfaces();
        return (T)Proxy.newProxyInstance(classLoader,new Class[]{interfaces[0]},handler);
    }
}
