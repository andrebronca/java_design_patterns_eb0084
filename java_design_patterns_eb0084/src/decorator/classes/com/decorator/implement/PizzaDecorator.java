package com.decorator.implement;

import com.decorator.interfaces.Pizza;

/**
 * 17/set/2022
 * @author andrebronca
 */
public abstract class PizzaDecorator implements Pizza{

  @Override
  public String getDesc() {
    return "Toppings";
  }
  
}
