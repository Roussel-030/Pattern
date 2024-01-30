package com.observerPattern.useObserverJava.interfaces.subject;

import com.observerPattern.useObserverJava.classes.dataWeather.DataWeather;
import com.observerPattern.useObserverJava.interfaces.observer.Observer;

import java.util.concurrent.Flow;

public interface Subject extends Flow.Publisher<DataWeather> {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver(DataWeather dataWeather);
}
