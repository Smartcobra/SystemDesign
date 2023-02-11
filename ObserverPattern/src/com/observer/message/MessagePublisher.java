package com.observer.message;

import com.observer.observer.Observer;
import com.observer.observer.impl.SecondMessageSubscriber;
import com.observer.subject.Subject;

import java.util.HashSet;
import java.util.Set;

public class MessagePublisher implements Subject {
    private Set<Observer> observers = new HashSet<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUpdate(Message message) {
      observers.forEach(o->o.updateObserver(message));
    }
}
