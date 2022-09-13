package com.factory.services;

import com.factory.classes.ResponseXMLParser;
import com.factory.abstracts.DisplayService;
import com.factory.interfaces.XMLParser;

/**
 * 13/set/2022
 * @author andre
 */
public class ResponseXMLDisplayService extends DisplayService{

  @Override
  protected XMLParser getParser() {
    return new ResponseXMLParser();
  }
  
}
