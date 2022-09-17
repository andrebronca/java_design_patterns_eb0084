package com.decorator.concrete;

import com.decorator.implement.PizzaDecorator;
import com.decorator.interfaces.Pizza;

/**
 * 17/set/2022
 *
 * @author andrebronca
 */
public class Ham extends PizzaDecorator {

  private final Pizza pizza;

  public Ham(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() + ", Ham (18.12)";
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + 18.12;
  }

}
