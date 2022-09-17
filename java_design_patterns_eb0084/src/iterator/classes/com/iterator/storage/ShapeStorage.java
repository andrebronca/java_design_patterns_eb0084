package com.iterator.storage;

import com.iterator.model.Shape;

/**
 * 17/set/2022
 * @author andrebronca
 */
public class ShapeStorage {
  private Shape[] shapes = new Shape[5];
  private int index;
  
  public void addShape(String name){
    int i = index++;
    shapes[i] = new Shape(i, name);
  }
  
  public Shape[] getShapes(){
    return shapes;
  }
}
