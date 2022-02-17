package org.itstack.demo.design.cuisine.impl;

import org.itstack.demo.design.CacheService;
import org.itstack.demo.design.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 *  缓存服务统一实现层
 */

public class CacheServiceImpl implements CacheService {

    RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key,value,timeout,timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
