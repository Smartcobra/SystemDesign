package com.observer.observer.impl;

import com.observer.message.Message;
import com.observer.observer.Observer;

public class ThirdMessageSubscriber implements Observer {

    @Override
    public void updateObserver(Message message) {
        System.out.println("Message for the third subscriber::: " + message.getMessage());
    }
}
