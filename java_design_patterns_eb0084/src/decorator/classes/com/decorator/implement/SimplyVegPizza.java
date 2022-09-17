package com.decorator.implement;

import com.decorator.interfaces.Pizza;

/**
 * 17/set/2022
 * @author andrebronca
 */
public class SimplyVegPizza implements Pizza{

  @Override
  public String getDesc() {
    return "SimplyVegPizza (230)";
  }

  @Override
  public double getPrice() {
    return 230;
  }
  
}
