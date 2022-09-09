package com.observer.nativo_java;

import java.util.Observable;

/**
 *
 * @author andre
 */
public class SMSUsersObserver implements java.util.Observer{

    private String desc;
    private final String userInfo;
    private final Observable observable;
    
    
    public SMSUsersObserver(Observable observable, String userInfo) {
        this.observable = observable;
        this.userInfo = userInfo;
    }
    
    public void subscribe(){
        System.out.println("Subscribing "+ userInfo +" to "
                +((CommentaryObjectObsrevable)(observable)).subjectDetails() +"...");
        this.observable.addObserver(this);
        System.out.println("Subscribe successfully.");
    }
    
    public void unSubscribe(){
        System.out.println("Unsubscribing "+ userInfo +" to "
                +((CommentaryObjectObsrevable)(observable)).subjectDetails() +"...");
        this.observable.deleteObserver(this);
        System.out.println("Unsubscribe successfully.");
    }

    @Override
    public void update(Observable o, Object arg) {
        desc = (String) arg;
        display();
    }
    
    private void display(){
        System.out.println("["+ userInfo +"]: "+ desc);
    }
    
}
