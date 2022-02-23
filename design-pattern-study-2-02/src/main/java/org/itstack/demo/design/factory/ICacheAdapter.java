package org.itstack.demo.design.factory;

import java.util.concurrent.TimeUnit;

/**
 *  通过定义统一的缓存操作抽象来屏蔽两个集群的差异性
 *
 */
public interface ICacheAdapter  {

    void set(String key,String value);
    void set(String key, String value, long timeout, TimeUnit timeunit);
    String get(String key);
    void del(String key);
}
