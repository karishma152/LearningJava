package DesignPattern.Observer.Pull;

import java.util.ArrayList;
import java.util.List;

public class IphoneSystem implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String notification;
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update();
        }
    }

    public void newNotification(String message){
        this.notification = message;
        notifyObservers();
    }

    public String getNotification(){
        return notification;
    }
}
