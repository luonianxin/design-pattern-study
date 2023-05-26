package org.luonianxin.learn.subject.impl;

import org.luonianxin.learn.observer.Observer;
import org.luonianxin.learn.subject.Subject;

import java.util.ArrayList;

/**
 * @author luonianxin
 * @version 1.0
 * @date 2023/5/26 22:51
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    /**
     *  注册观察者
     * @param observer 观察者对象
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i > 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i< observers.size();i++){
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     *  我们从已知需求中知道的对象本来的方法
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
