package com.abstract_factory.concretes;

import com.abstract_factory.interfaces.XMLParser;

/**
 * 13/set/2022
 * @author andre
 */
public class TWFeedbackXMLParser  implements XMLParser{

  @Override
  public String parse() {
    System.out.println("TW Parsing feedback XML...");
    return "TW Feedback XML Message";
  }
  
}
