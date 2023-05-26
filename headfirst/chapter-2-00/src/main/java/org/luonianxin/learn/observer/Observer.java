package org.luonianxin.learn.observer;

/**
 * @author luonianxin
 * @version 1.0
 * @date 2023/5/26 20:57
 */
public interface Observer {
    /**
     *  主题更新通知方法
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);
}
