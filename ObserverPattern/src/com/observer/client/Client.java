package com.observer.client;

import com.observer.message.Message;
import com.observer.message.MessagePublisher;
import com.observer.observer.impl.FirstMessageSubscriber;
import com.observer.observer.impl.SecondMessageSubscriber;
import com.observer.observer.impl.ThirdMessageSubscriber;

public class Client {
    public static void main(String[] args) {
        FirstMessageSubscriber firstMessageSubscriber = new FirstMessageSubscriber();
        SecondMessageSubscriber secondMessageSubscriber = new SecondMessageSubscriber();
        ThirdMessageSubscriber thirdMessageSubscriber = new ThirdMessageSubscriber();

        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.register(firstMessageSubscriber);
        messagePublisher.register(secondMessageSubscriber);

        messagePublisher.notifyUpdate(new Message(" This is the first Message"));
        System.out.println("Second message");
        messagePublisher.unregister(firstMessageSubscriber);
        messagePublisher.register(thirdMessageSubscriber);

        messagePublisher.notifyUpdate(new Message(" This is the second Message"));


    }
}
