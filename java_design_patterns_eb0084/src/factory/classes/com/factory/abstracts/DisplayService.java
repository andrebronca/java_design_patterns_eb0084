package com.factory.abstracts;

import com.factory.interfaces.XMLParser;

/**
 * 13/set/2022
 * @author andre
 */
public abstract class DisplayService {
  public void display(){
    XMLParser parser = getParser();
    String msg = parser.parse();
    System.out.println(msg);
  }
  
  protected abstract XMLParser getParser();
}
