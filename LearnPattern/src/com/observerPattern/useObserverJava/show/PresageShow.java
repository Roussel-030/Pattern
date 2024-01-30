package com.observerPattern.useObserverJava.show;

import com.observerPattern.useMyHand.interfaces.observer.Observer;
import com.observerPattern.useMyHand.interfaces.show.Show;
import com.observerPattern.useMyHand.interfaces.subject.Subject;

public class PresageShow implements Observer, Show {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject dataWeather;

    //Constructor with parameter
    public  PresageShow(Subject dataWeather) {
        this.dataWeather = dataWeather;
        dataWeather.saveObserver(this);
    }

    //Override methods
    @Override
    public void upgrade(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.show();
    }

    @Override
    public void show() {
        System.out.println("Presage : \nTemperature: "+getTemperature()+"\t"+"Humidity: "+getHumidity()+"\t"+"Pressure: "+getPressure());
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

}
