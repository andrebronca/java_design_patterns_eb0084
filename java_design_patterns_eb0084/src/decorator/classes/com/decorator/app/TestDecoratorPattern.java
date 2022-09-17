package com.decorator.app;

import com.decorator.concrete.Cheese;
import com.decorator.concrete.GreenOlives;
import com.decorator.concrete.Ham;
import com.decorator.concrete.Meat;
import com.decorator.concrete.RomaTomatoes;
import com.decorator.concrete.Spinach;
import com.decorator.implement.SimplyNonVegPizza;
import com.decorator.implement.SimplyVegPizza;
import com.decorator.interfaces.Pizza;
import java.text.DecimalFormat;


/**
 * 17/set/2022
 * @author andrebronca
 */
public class TestDecoratorPattern {
  public static void main(String[] args) {
    DecimalFormat dformat = new DecimalFormat("#.##");
    Pizza pizza = new SimplyVegPizza();
    
    pizza = new RomaTomatoes(pizza);
    pizza = new GreenOlives(pizza);
    pizza = new Spinach(pizza);
    
    System.out.println("Desc: "+ pizza.getDesc());
    System.out.println("Price: "+ dformat.format(pizza.getPrice()));
    
    System.out.println("----------------");
    pizza = new SimplyNonVegPizza();
    pizza = new Meat(pizza);
    pizza = new Cheese(pizza);
    pizza = new Cheese(pizza);
    pizza = new Ham(pizza);
    
    System.out.println("Desc: "+ pizza.getDesc());
    System.out.println("Price: "+ dformat.format(pizza.getPrice()));
  }
}
