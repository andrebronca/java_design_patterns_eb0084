package com.decorator.concrete;

import com.decorator.implement.PizzaDecorator;
import com.decorator.interfaces.Pizza;

/**
 * 17/set/2022
 * @author andrebronca
 */
public class FetaCheese extends PizzaDecorator{

  private final Pizza pizza;

  public FetaCheese(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() +", Feta Cheese (25.88)";
  }
  
  
  
  @Override
  public double getPrice() {
    return pizza.getPrice() + 25.88;
  }
  
}
