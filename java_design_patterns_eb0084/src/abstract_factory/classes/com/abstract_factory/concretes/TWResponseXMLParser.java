package com.abstract_factory.concretes;

import com.abstract_factory.interfaces.XMLParser;

/**
 * 13/set/2022
 * @author andre
 */
public class TWResponseXMLParser  implements XMLParser{

  @Override
  public String parse() {
    System.out.println("TW Parsing response XML...");
    return "TW Response XML Message";
  }
  
}
