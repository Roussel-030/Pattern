package com.observerPattern.useObserverJava.interfaces.observer;

import com.observerPattern.useObserverJava.classes.dataWeather.DataWeather;

import java.util.concurrent.Flow;

public interface Observer extends Flow.Subscriber<DataWeather>{}
