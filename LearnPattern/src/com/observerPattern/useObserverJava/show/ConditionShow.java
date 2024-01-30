package com.observerPattern.useObserverJava.show;

import com.observerPattern.useObserverJava.classes.dataWeather.DataWeather;
import com.observerPattern.useObserverJava.interfaces.observer.Observer;
import com.observerPattern.useObserverJava.interfaces.show.Show;
import com.observerPattern.useObserverJava.interfaces.subject.Subject;

import java.util.concurrent.Flow;

public class ConditionShow implements Observer, Show {

    private Flow.Subscription subscription;
    private Subject subject;

    //Default constructor
    public ConditionShow(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    //Override methods
    @Override
    public void show(DataWeather item) {
        System.out.println("Now condition : \nTemperature: "+item.getTemperature()+"\t"+"Humidity: "+item.getHumidity()+"\t"+"Pressure: "+item.getPressure());
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(DataWeather item) {
        this.show(item);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }

}
