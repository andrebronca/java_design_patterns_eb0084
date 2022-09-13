package com.factory.services;

import com.factory.classes.OrderXMLParser;
import com.factory.abstracts.DisplayService;
import com.factory.interfaces.XMLParser;

/**
 * 13/set/2022
 * @author andre
 */
public class OrderXMLDisplayService extends DisplayService{

  @Override
  protected XMLParser getParser() {
    return new OrderXMLParser();
  }
  
}
