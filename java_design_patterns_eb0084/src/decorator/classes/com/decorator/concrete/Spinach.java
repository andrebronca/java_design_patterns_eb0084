package com.decorator.concrete;

import com.decorator.implement.PizzaDecorator;
import com.decorator.interfaces.Pizza;

/**
 * 17/set/2022
 *
 * @author andrebronca
 */
public class Spinach extends PizzaDecorator {

  private final Pizza pizza;
  private final double PRICE = 7.92; //isso deveria vir de um BD

  public Spinach(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDesc() {
    return pizza.getDesc() + ", Spinach ("+ PRICE +")";
  }

  @Override
  public double getPrice() {
    return pizza.getPrice() + PRICE;
  }

}
