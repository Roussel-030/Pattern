package com.observerPattern.useMyHand.classes.dataWeather;

import com.observerPattern.useMyHand.interfaces.observer.Observer;
import com.observerPattern.useMyHand.interfaces.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class DataWeather implements Subject {

   private float temperature;
   private float humidity;
   private float pressure;
   private List<Observer> observers;

   //Constructor
   public DataWeather() {
       this.observers = new ArrayList<>();
   }

   //Override methods
    @Override
    public void saveObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: this.observers) {
            observer.upgrade(getTemperature(), getHumidity(), getPressure());
        }
    }

    //Local method
    public void upgradeMeasure() {
       this.notifyObserver();
    }

    //Getters
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    //Setter
    public void setMeasure(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.upgradeMeasure();
    }

}
