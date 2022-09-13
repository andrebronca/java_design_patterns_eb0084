package com.memento.app;

import com.memento.CareTaker;
import com.memento.Originator;

/**
 * 13/set/2022
 * @author andrebronca
 * 
 * 
 */
public class TestMementoPattern {
  public static void main(String[] args) {
    CareTaker careTaker = new CareTaker();
    Originator originator = new Originator(5, 10, careTaker);
    System.out.println("Default State: "+ originator);
    
    originator.setX(originator.getY() * 51);
    System.out.println("State: "+ originator);
    originator.createSavepoint("save1");
    
    originator.setY(originator.getX() / 22);
    System.out.println("State: "+ originator);
    
    originator.undo();
    System.out.println("State after undo: "+ originator);
    
    originator.setX(Math.pow(originator.getX(), 3));
    originator.createSavepoint("save2");
    System.out.println("Sate: "+ originator);
    
    originator.setY(originator.getX() - 30);
    originator.createSavepoint("save3");
    System.out.println("State: "+ originator);
    
    originator.setY(originator.getX() / 22);
    originator.createSavepoint("save4");
    System.out.println("State: "+ originator);
    
    originator.undo("save2");
    System.out.println("Retrieving at: "+ originator);
    
    originator.undoAll();
    System.out.println("State after undo all: "+ originator);
    
  }
}
