package com.observer.message;

public class Message {
    private final String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
