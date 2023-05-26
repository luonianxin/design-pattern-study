package org.luonianxin.learn.display;

import org.luonianxin.learn.api.DisplayElement;
import org.luonianxin.learn.observer.Observer;
import org.luonianxin.learn.subject.Subject;

/**
 * @author luonianxin
 * @version 1.0
 * @date 2023/5/26 22:58
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     *  构造器需要主题对象也就是WeatherData
     * @param weatherData 主题
     */
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     *  每个布告板实现该方法
     */
    @Override
    public void display() {
        System.err.println("Current conditions:"+temperature+" F degrees and "+humidity +"% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity =humidity;
        display();
    }
}
