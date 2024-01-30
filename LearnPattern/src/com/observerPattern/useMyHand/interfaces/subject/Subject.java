package com.observerPattern.useMyHand.interfaces.subject;

import com.observerPattern.useMyHand.interfaces.observer.Observer;

public interface Subject {
    void saveObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver();
}
