package com.observer.impl;

import com.observer.interfaces.Commentary;
import com.observer.interfaces.Observer;
import com.observer.interfaces.Subject;
import java.util.List;

/**
 *
 * @author andre
 */
public class CommentaryObject implements Subject, Commentary{
    
    private final List<Observer> observers;
    private String desc;
    private final String subjectDetails;

    public CommentaryObject(List<Observer> observers, String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }
    
    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObservers();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        System.out.println();
        for(Observer o : observers){
            o.update(desc);
        }
    }

    @Override
    public String subjectDetails() {
        return subjectDetails;
    }
    
}
