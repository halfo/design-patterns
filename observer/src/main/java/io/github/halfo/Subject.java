package io.github.halfo;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int state;
    private List<Observer> observers = new ArrayList<>();

    public int getState() { return state; }
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);    
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers)
            observer.update();
    }  
}
