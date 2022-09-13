package com.abstract_factory.concretes;

import com.abstract_factory.interfaces.XMLParser;

/**
 * 13/set/2022
 * @author andre
 */
public class NYErrorXMLParser implements XMLParser{

  @Override
  public String parse() {
    System.out.println("NY Parsing error XML...");
    return "NY Error XML Message";
  }
  
}
