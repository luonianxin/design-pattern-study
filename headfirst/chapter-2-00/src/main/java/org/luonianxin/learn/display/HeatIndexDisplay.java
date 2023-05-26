package org.luonianxin.learn.display;

import org.luonianxin.learn.api.DisplayElement;
import org.luonianxin.learn.observer.Observer;
import org.luonianxin.learn.subject.Subject;

/**
 * 带酷热指数的布告板
 * @author luonianxin
 * @version 1.0
 * @date 2023/5/26 23:09
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    /**
     *  相对湿度
     */
    private float rh;

    private float heatIndex;

    private Subject subject;

    public HeatIndexDisplay(Subject subject){
        this.subject = subject;
        // 注册观察者
        subject.registerObserver(this);
    }


    @Override
    public void display() {
        System.err.println("Current conditions:"+temperature+" F degrees and "+humidity +"% humidity");
        System.err.println("Heat Index is "+heatIndex);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.rh = humidity;
        this.heatIndex = computeHeatIndex(temp,rh);
        display();
    }

    /**
     * 计算酷热指数
     * @param t 温度
     * @param rh 湿度
     * @return
     */
    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
}
