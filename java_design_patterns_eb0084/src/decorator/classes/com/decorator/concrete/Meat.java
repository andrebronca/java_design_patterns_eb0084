package com.decorator.concrete;

import com.decorator.implement.PizzaDecorator;
import com.decorator.interfaces.Pizza;

/**
 * 17/set/2022
 *
 * @author andrebronca
 */
public class Meat extends PizzaDecorator {

  private final Pizza pizza;

  public Meat(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() + ", Meat (14.25)";
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + 14.25;
  }

}
