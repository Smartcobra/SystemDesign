package com.observer.observer.impl;

import com.observer.message.Message;
import com.observer.observer.Observer;

public class SecondMessageSubscriber implements Observer {

    @Override
    public void updateObserver(Message message) {
        System.out.println("Message for the second subscriber::: "+ message.getMessage());
    }

}
