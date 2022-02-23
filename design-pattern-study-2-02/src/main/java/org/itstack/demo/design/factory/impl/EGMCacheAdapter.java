package org.itstack.demo.design.factory.impl;

import org.itstack.demo.design.factory.ICacheAdapter;
import org.itstack.demo.design.matter.EGM;

import java.util.concurrent.TimeUnit;

/**
 *  EGM集群适配器，实现统一适配器接口，屏蔽接口差异，对用户来说是透明的(luonianxin)
 *  <p>
 *  仅仅就个人理解来说，该模式在日常开发中经常使用，例如在service中调用DAO层，或者调用其他
 *  组件来实现业务功能等，这种通过接口来屏蔽实现细节的应用是很常见的。
 * @author: xiaofuge
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egmCache = new EGM();

    @Override
    public void set(String key, String value) {
        egmCache.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeunit) {
        egmCache.setEx(key,value,timeout,timeunit);
    }

    @Override
    public String get(String key) {
        return egmCache.gain(key);
    }

    @Override
    public void del(String key) {
        egmCache.delete(key);
    }
}
