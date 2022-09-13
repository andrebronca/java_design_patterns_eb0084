package com.abstract_factory.concretes;

import com.abstract_factory.interfaces.XMLParser;

/**
 * 13/set/2022
 * @author andre
 */
public class NYFeedbackXMLParser  implements XMLParser{

  @Override
  public String parse() {
    System.out.println("NY Parsing feedback XML...");
    return "NY Feedback XML Message";
  }
  
}
