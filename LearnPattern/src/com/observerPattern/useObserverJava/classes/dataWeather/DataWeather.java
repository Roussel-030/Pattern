package com.observerPattern.useObserverJava.classes.dataWeather;

public class DataWeather {

    private float temperature;
    private float humidity;
    private float pressure;

    //Default constructor
    public DataWeather() {
    }

    //Constructor with parameters
    public DataWeather(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    //Getters and setters
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

}
