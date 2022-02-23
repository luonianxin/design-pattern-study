package org.itstack.demo.design.factory.impl;

import org.itstack.demo.design.factory.ICacheAdapter;
import org.itstack.demo.design.matter.IIS;

import java.util.concurrent.TimeUnit;

/**
 *  IIS 第二种缓存集群适配器
 */
public class IISCacheAdapter implements ICacheAdapter {

    private IIS iisCache = new IIS();

    @Override
    public void set(String key, String value) {
        iisCache.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeunit) {
        iisCache.setExpire(key,value,timeout,timeunit);
    }

    @Override
    public String get(String key) {
        return iisCache.get(key);
    }

    @Override
    public void del(String key) {
        iisCache.del(key);
    }
}
