package org.luonianxin.learn;

import org.luonianxin.learn.display.CurrentConditionsDisplay;
import org.luonianxin.learn.display.HeatIndexDisplay;
import org.luonianxin.learn.subject.impl.WeatherData;

/**
 *  观察者模式测试类
 * @author luonianxin
 * @version 1.0
 * @date 2023/5/26 23:03
 */
public class SubjectObserverApplication {
    public static void main(String [] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(79,90,28.9f);
    }
}
