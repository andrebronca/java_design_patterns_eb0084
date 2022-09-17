package com.decorator.concrete;

import com.decorator.implement.PizzaDecorator;
import com.decorator.interfaces.Pizza;

/**
 * 17/set/2022
 *
 * @author andrebronca
 */
public class Cheese extends PizzaDecorator {

  private final Pizza pizza;

  public Cheese(Pizza pizza) {
    this.pizza = pizza;
  }

  //Esse preço tem que vir de uma consulta a BD
  @Override
  public String getDesc() {
    return pizza.getDesc() + ", Cheese (20.72)";
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + 20.72;
  }

}
