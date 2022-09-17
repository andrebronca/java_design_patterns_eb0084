package com.decorator.implement;

import com.decorator.interfaces.Pizza;

/**
 * 17/set/2022
 * @author andrebronca
 */
public class SimplyNonVegPizza implements Pizza{

  @Override
  public String getDesc() {
    return "SimplyNonVegPizza (350)";
  }

  @Override
  public double getPrice() {
    return 350;
  }
  
}
