package com.factory.classes;

import com.factory.interfaces.XMLParser;

/**
 * 13/set/2022
 * @author andre
 */
public class ResponseXMLParser implements XMLParser{

  @Override
  public String parse() {
    System.out.println("Parsing response XML...");
    return "Response XML Message";
  }
  
}
