package org.itstack.demo.design.cuisine.impl;

import org.itstack.demo.design.CacheService;
import org.itstack.demo.design.RedisUtils;
import org.itstack.demo.design.matter.EGM;
import org.itstack.demo.design.matter.IIS;

import java.util.concurrent.TimeUnit;

/**
 *  第一种实现方式实现类
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    private EGM egm = new EGM();

    private IIS iis = new IIS();


    @Override
    public void set(String key, String value, int redisType) {
        if(1 == redisType){
            egm.set(key,value);
            return;
        }
        if(2 == redisType){
            iis.set(key,value);
            return;
        }
        redisUtils.set(key,value);
    }

    @Override
    public String get(String key, int redisType) {
        if(1 == redisType){
            return egm.gain(key);
        }
        if(2 == redisType){
            return iis.get(key);
        }
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeunit, int redisType) {
        if(1 == redisType){
            egm.setEx(key,value,timeout,timeunit);
            return;
        }
        if(2 == redisType){
            iis.setExpire(key,value,timeout,timeunit);
            return;
        }
        redisUtils.set(key,value,timeout,timeunit);
    }

    /**
     * 根据key 删除缓存数据
     *
     * @param key
     * @param redisType
     */
    @Override
    public void del(String key, int redisType) {
        if(1 == redisType){
            egm.delete(key);
            return;
        }
        if(2 == redisType){
            iis.del(key);
            return;
        }
        redisUtils.del(key);
    }
}
