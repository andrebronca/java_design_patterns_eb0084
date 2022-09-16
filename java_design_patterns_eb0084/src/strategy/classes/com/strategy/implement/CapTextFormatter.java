package com.strategy.implement;

import com.strategy.interfaces.TextFormater;

/**
 * 16/set/2022
 * @author andrebronca
 */
public class CapTextFormatter implements TextFormater{

  @Override
  public void format(String text) {
    System.out.println("[CapTextFormatter]: "+ text.toUpperCase());
  }
  
}
