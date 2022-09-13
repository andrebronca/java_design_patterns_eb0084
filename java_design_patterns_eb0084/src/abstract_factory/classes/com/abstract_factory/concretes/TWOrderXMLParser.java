package com.abstract_factory.concretes;

import com.abstract_factory.interfaces.XMLParser;

/**
 * 13/set/2022
 * @author andre
 */
public class TWOrderXMLParser  implements XMLParser{

  @Override
  public String parse() {
    System.out.println("TW Parsing order XML...");
    return "TW Order XML Message";
  }
  
}
