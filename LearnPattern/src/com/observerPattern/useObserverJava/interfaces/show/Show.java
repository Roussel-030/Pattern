package com.observerPattern.useObserverJava.interfaces.show;

import com.observerPattern.useObserverJava.classes.dataWeather.DataWeather;

public interface Show {
    default void show(DataWeather item) {
        System.out.println("Now condition : \nTemperature: "+item.getTemperature()+"\t"+"Humidity: "+item.getHumidity()+"\t"+"Pressure: "+item.getPressure());
    }
}
