package com.decorator.concrete;

import com.decorator.implement.PizzaDecorator;
import com.decorator.interfaces.Pizza;

/**
 * 17/set/2022
 *
 * @author andrebronca
 */
public class Chicken extends PizzaDecorator {

  private final Pizza pizza;

  public Chicken(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() + ", Chicken (12.75)";
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + 12.75;
  }

}
