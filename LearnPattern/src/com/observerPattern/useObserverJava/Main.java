package com.observerPattern.useObserverJava;

import com.observerPattern.useObserverJava.classes.observablySubject.ObservablySubject;
import com.observerPattern.useObserverJava.classes.observant.ConditionObservant;
import com.observerPattern.useObserverJava.classes.observant.PresageObservant;
import com.observerPattern.useObserverJava.classes.observant.StatObservant;

public class Main {
    public static void main(String args[]) {
        //Subject
        ObservablySubject observablySubject = new ObservablySubject();

        //Observer
        ConditionObservant conditionObservant = new ConditionObservant();
        PresageObservant presageObservant = new PresageObservant();
        StatObservant statObservant = new StatObservant();

        //Add Observers
        observablySubject.addObserver(conditionObservant);
        observablySubject.addObserver(presageObservant);
        observablySubject.addObserver(statObservant);

        //Upgrade
        observablySubject.setMeasures(1.1f, 1.2f, 1.3f);
    }
}
