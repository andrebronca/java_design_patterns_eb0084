package com.abstract_factory.concretes;

import com.abstract_factory.interfaces.XMLParser;

/**
 * 13/set/2022
 * @author andre
 */
public class NYOrderXMLParser  implements XMLParser{

  @Override
  public String parse() {
    System.out.println("NY Parsing order XML...");
    return "NY Order XML Message";
  }
  
}
