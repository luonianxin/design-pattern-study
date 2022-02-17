package org.itstack.demo.design.matter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 *  模拟第一套企业级集群访问方式
 */
public class EGM {

    private Logger logger = LoggerFactory.getLogger(EGM.class);

    private Map<String, String> dataMap = new ConcurrentHashMap<String, String>();


    public String gain(String key){
        logger.info("EGM 获取数据， key: {}",key);
        return dataMap.get(key);
    }

    public void set(String key, String value){
        logger.info("EGM 存储数据，key: {}, value: {}",key,value);
        dataMap.put(key,value);
    }

    public void setEx(String key, String value, long timeout, TimeUnit timeUnit){
        logger.info("EGM 存储过期清除数据，key: {}, value: {},timeout {},timeUnit {}",key,value,timeout,timeUnit);
        dataMap.put(key, value);
    }

    public void delete(String key){
        logger.info("EGM 移除数据，key: {}",key);
        dataMap.remove(key);
    }
}
