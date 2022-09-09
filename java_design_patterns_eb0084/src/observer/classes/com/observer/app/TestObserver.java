package com.observer.app;

import com.observer.impl.CommentaryObject;
import com.observer.impl.SMSUsers;
import com.observer.interfaces.Commentary;
import com.observer.interfaces.Observer;
import com.observer.interfaces.Subject;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new CommentaryObject(new ArrayList<>(), "Soccer match [2014AUG24]");
        Observer observer = new SMSUsers(subject, "Aam Warner [New York]");
        observer.subscribe();
        System.out.println();
        
        Observer observer2 = new SMSUsers(subject, "Tim Ronney [London]");
        observer2.subscribe();
        
        Commentary cObject = ((Commentary) subject);
        cObject.setDesc("Welcome to live Soccer match");
        cObject.setDesc("Current score 0-0");
        System.out.println();
        
        observer2.unSubscribe();
        System.out.println();
        
        cObject.setDesc("It's a goal!!");
        cObject.setDesc("Current score 1-0");
        System.out.println();
        
        Observer observer3 = new SMSUsers(subject, "Marrie [Paris]");
        observer3.subscribe();
        System.out.println();
        
        cObject.setDesc("It's another goal!!");
        cObject.setDesc("Half-time socre 2-0");
    }
}
