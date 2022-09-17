package com.iterator.model;

/**
 * 17/set/2022
 * @author andrebronca
 */
public class Shape {
  private int id;
  private String name;

  public Shape(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Id: "+ id +" Shape: "+ name;
  }
  
  
}
