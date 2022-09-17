package com.iterator.implement;

import com.iterator.model.Shape;
import java.util.Iterator;

/**
 * 17/set/2022
 *
 * @author andrebronca
 * Não está funcionando vou corrigir.
 */
public class ShapeIterator implements Iterator<Shape> {

  private Shape[] shapes;
  private int pos;

  public ShapeIterator(Shape[] shapes) {
    this.shapes = shapes;
    this.pos = 0;
  }

  @Override
  public boolean hasNext() {
    if (pos >= shapes.length || shapes[pos] == null){
      return false;
    }
    return true;
  }

  @Override
  public Shape next() {
    return shapes[pos++];
  }
  

  @Override
  public void remove() {
    if (pos <= 0) {
      throw new IllegalStateException("Illegal position");
    }
    if (shapes[pos - 1] != null) {
      for (int i = pos - 1; i < (shapes.length - 1); i++) {
        shapes[i] = shapes[i + 1];
      }
      shapes[shapes.length - 1] = null;
    }
  }

}
