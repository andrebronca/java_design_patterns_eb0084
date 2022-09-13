package com.abstract_factory.concretes;

import com.abstract_factory.interfaces.XMLParser;

/**
 * 13/set/2022
 * @author andre
 */
public class TWErrorXMLParser implements XMLParser{

  @Override
  public String parse() {
    System.out.println("TW Parsing error XML...");
    return "TW Error XML Message";
  }
  
}
