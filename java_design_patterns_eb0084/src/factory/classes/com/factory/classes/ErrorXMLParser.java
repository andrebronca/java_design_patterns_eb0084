package com.factory.classes;

import com.factory.interfaces.XMLParser;

/**
 * 13/set/2022
 * @author andre
 */
public class ErrorXMLParser implements XMLParser{

    @Override
    public String parse() {
      System.out.println("Parsing error XML...");
      return "Error XML Message";
    }
    
}
