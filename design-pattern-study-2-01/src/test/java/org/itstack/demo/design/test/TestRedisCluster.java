package org.itstack.demo.design.test;

import org.itstack.demo.design.CacheService;
import org.itstack.demo.design.cuisine.impl.CacheServiceImpl;
import org.junit.Test;

public class TestRedisCluster {
    @Test
    public void test_CacheService(){
        CacheService cacheService = new CacheServiceImpl();
        cacheService.set("key1","value1",1);
        String val01 = cacheService.get("key1", 1);
        System.out.println("测试结果：" + val01);

    }
}
