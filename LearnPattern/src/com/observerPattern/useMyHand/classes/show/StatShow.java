package com.observerPattern.useMyHand.classes.show;

import com.observerPattern.useMyHand.interfaces.observer.Observer;
import com.observerPattern.useMyHand.interfaces.show.Show;
import com.observerPattern.useMyHand.interfaces.subject.Subject;

public class StatShow implements Observer, Show {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject dataWeather;

    //Constructor with parameter
    public  StatShow(Subject dataWeather) {
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
        System.out.println("Stat : \nTemperature: "+getTemperature()+"\t"+"Humidity: "+getHumidity()+"\t"+"Pressure: "+getPressure());
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
