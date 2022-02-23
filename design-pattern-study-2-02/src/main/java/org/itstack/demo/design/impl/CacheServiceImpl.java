package org.itstack.demo.design.impl;

import org.itstack.demo.design.CacheService;
import org.itstack.demo.design.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 *  缓存服务校验层
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public void set(String key, String value) {
        redisUtils.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeunit) {
        redisUtils.set(key,value,timeout,timeunit);
    }

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
