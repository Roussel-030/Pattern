package com.observerPattern.useObserverJava.classes.observant;

import com.observerPattern.useObserverJava.classes.dataWeather.DataWeather;
import com.observerPattern.useObserverJava.interfaces.observer.Observer;
import com.observerPattern.useObserverJava.interfaces.show.Show;

import java.util.concurrent.Flow;

public class ConditionObservant implements Observer, Show {

    private Flow.Subscription subscription;

    //Default constructor
    public ConditionObservant() {
    }

    //Override methods
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
