package com.memento;

/**
 * 13/set/2022
 * @author andrebronca
 *
 * Usando o memento, quando algum estado do objeto deve ser salvo e uma provável
 * recuperação deve ocorrer.
 * 
 * in JDK
 * ﻿ava.util.Date
 * java.io.Serializable
 */
public class Memento {
  private double x;
  private double y;

  public Memento(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
  
}
