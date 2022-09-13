package com.memento;

/**
 * 13/set/2022
 * @author andrebronca
 */
public class Originator {
  private double x;
  private double y;
  private final String INICIO = "inicio"; //livro não implementa
  
  private String lastUndoSavepoint;
  CareTaker careTaker;

  public Originator(double x, double y, CareTaker careTaker) {
    this.x = x;
    this.y = y;
    this.careTaker = careTaker;
    createSavepoint(INICIO);
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  //isso poderia ser um inteiro sequencial
  public void createSavepoint(String savepointName){
    careTaker.saveMemento(new Memento(this.x, this.y), savepointName);
    lastUndoSavepoint = savepointName;
  }
  
  public void undo(){
    setOriginatorState(lastUndoSavepoint);
  }
  
  public void undo(String savepointName){
    setOriginatorState(savepointName);
  }
  
  public void undoAll(){
    setOriginatorState(INICIO);
    careTaker.clearSavepoints();
  }

  private void setOriginatorState(String savepointName){
    Memento mem = careTaker.getMemento(savepointName);
    this.x = mem.getX();
    this.y = mem.getY();
  }
  
  @Override
  public String toString() {
    return "X: "+ x +", Y: "+ y;
  }
  
  
}
