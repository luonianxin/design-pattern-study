package org.itstack.demo.design;

import java.util.concurrent.TimeUnit;

/**
 *  第一种实现方式，使用if、else一坨坨代码实现
 */
public interface CacheService {

    void set(String key,String value ,int redisType);
    String get(String key ,int redisType);
    void set(String key, String value, long timeout, TimeUnit timeunit,int redisType);

    /**
     *  根据key 删除缓存数据
     * @param key
     */
    void del(String key,int redisType);
}
