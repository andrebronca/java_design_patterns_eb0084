package com.observer.nativo_java;

/**
 *
 * @author andre
 */
public class Test {
    public static void main(String[] args) {
        CommentaryObjectObsrevable obj = new CommentaryObjectObsrevable("Soccer match [2014AUG24]");
        SMSUsersObserver observer = new SMSUsersObserver(obj, "> Adam Warner [New York]");
        SMSUsersObserver observer2 = new SMSUsersObserver(obj, "> Tim Ronney [London]");
        observer.subscribe();
        observer2.subscribe();
        obj.setDesc("Welcome to live Soccer match");
        obj.setDesc("Current score 0-0");
        
        observer.unSubscribe();
        
        obj.setDesc("It's a goal!!");
        obj.setDesc("Current score 1-0");
    }
}
