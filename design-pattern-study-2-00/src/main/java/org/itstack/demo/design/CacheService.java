package org.itstack.demo.design;

import java.util.concurrent.TimeUnit;

/**
 *  统一缓存服务接口抽象
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
