package edu.asu.oop2.project;

import java.util.ArrayList;
import java.util.List;


public class Notification {
    private List<Subscribers> subscribers;

    public Notification() {
        subscribers=new ArrayList<>();
    }
    
    public void subscribe(Subscribers subscriber){
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscribers subscriber){
        subscribers.remove(subscriber);
    }
    
    public void alert(String msg){
        for(Subscribers subscriber:subscribers){
            subscriber.update(msg);
        }
    }
    
}
