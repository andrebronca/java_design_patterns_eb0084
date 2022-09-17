package com.decorator.concrete;

import com.decorator.implement.PizzaDecorator;
import com.decorator.interfaces.Pizza;

/**
 * 17/set/2022
 *
 * @author andrebronca
 */
public class GreenOlives extends PizzaDecorator {

  private final Pizza pizza;

  public GreenOlives(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() + ", Green Olives (5.47)";
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + 5.47;
  }

}
