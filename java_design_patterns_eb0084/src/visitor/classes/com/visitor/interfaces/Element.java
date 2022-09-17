package com.visitor.interfaces;

/**
 * 17/set/2022
 * @author andrebronca
 * 
 * Como estava precisando de classes do composite e este desse módulo, 
 * ocorreu erro de referência cíclica, então resolvi aplicar tudo nesse mesmo
 * módulo.
 */
public interface Element {
  public void accept(Visitor visitor);
}
