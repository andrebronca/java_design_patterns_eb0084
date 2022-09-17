package com.decorator.concrete;

import com.decorator.implement.PizzaDecorator;
import com.decorator.interfaces.Pizza;

/**
 * 17/set/2022
 *
 * @author andrebronca
 */
public class RedOnions extends PizzaDecorator {

  private final Pizza pizza;

  public RedOnions(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() + ", Red Onions (3.75)";
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + 3.75;
  }

}
