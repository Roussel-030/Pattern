package com.observerPattern.useObserverJava.classes.observablySubject;

import com.observerPattern.useObserverJava.classes.dataWeather.DataWeather;
import com.observerPattern.useObserverJava.interfaces.observer.Observer;
import com.observerPattern.useObserverJava.interfaces.subject.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class ObservablySubject implements Subject {

    private List<Observer> observers;

    //Default constructor
    public ObservablySubject() {
        this.observers = new ArrayList<>();
    }

    //Override methods
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver(DataWeather dataWeather) {
        for(Observer observer: this.observers) {
            observer.onNext(dataWeather);
        }
    }

    @Override
    public void subscribe(Flow.Subscriber<? super DataWeather> subscriber) {

    }

    //Setter
    public void setMeasures(float temperature, float humidity, float pressure) {
        DataWeather dataWeather = new DataWeather();
        dataWeather.setTemperature(temperature);
        dataWeather.setHumidity(humidity);
        dataWeather.setPressure(pressure);

        this.notifyObserver(dataWeather);
    }

}
