package com.factory.classes;

import com.factory.interfaces.XMLParser;

/**
 * 13/set/2022
 * @author andre
 */
public class FeedbackXML implements XMLParser{

  @Override
  public String parse() {
    System.out.println("Parsing feedback XML...");
    return "Feedback XML Message";
  }
  
}
