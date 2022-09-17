package com.decorator.concrete;

import com.decorator.implement.PizzaDecorator;
import com.decorator.interfaces.Pizza;

/**
 * 17/set/2022
 *
 * @author andrebronca
 */
public class Broccoli extends PizzaDecorator {

  private final Pizza pizza;

  public Broccoli(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() + ", Broccoli (9.25)";
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + 9.25;
  }

}
