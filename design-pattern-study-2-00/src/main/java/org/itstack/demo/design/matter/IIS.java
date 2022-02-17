package org.itstack.demo.design.matter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class IIS {

    private Logger logger = LoggerFactory.getLogger(IIS.class);

    private Map<String, String> dataMap = new ConcurrentHashMap<String, String>();

    public void set(String key,String value){
        logger.info("IIS 存储数据，key：{}，value:{}",key,value);
        dataMap.put(key,value);
    }

    public void setExpire(String key, String value, long timeout, TimeUnit timeUnit){
        logger.info("IIS 存储数据，key：{}，value:{},timeout:{}.timeUnit:{}",key,value,timeout,timeUnit);
        dataMap.put(key,value);
    }

    public String get(String key){
        logger.info("IIS 获取数据，key：{}",key);
        return dataMap.get(key);
    }

    public void del(String key){
        logger.info("IIS 删除数据，key：{}",key);
        dataMap.remove(key);
    }

}
