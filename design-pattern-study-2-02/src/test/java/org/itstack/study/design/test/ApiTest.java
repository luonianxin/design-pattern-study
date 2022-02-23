package org.itstack.study.design.test;

import org.itstack.demo.design.CacheService;
import org.itstack.demo.design.factory.JDKProxy;
import org.itstack.demo.design.factory.impl.EGMCacheAdapter;
import org.itstack.demo.design.factory.impl.IISCacheAdapter;
import org.itstack.demo.design.impl.CacheServiceImpl;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_CacheServiceImpl() throws Exception {

        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class,new EGMCacheAdapter());
        proxy_EGM.set("user_name_01","luonianxin_01");
        String result01 = proxy_EGM.get("user_name_01");
        System.out.println(result01);
        CacheService proxy_IIS = JDKProxy.getProxy(CacheServiceImpl.class,new IISCacheAdapter());
        proxy_IIS.set("user_name_02","luonianxin_02");
        String result02 = proxy_IIS.get("user_name_02");
        System.out.println(result02);
    }
}
