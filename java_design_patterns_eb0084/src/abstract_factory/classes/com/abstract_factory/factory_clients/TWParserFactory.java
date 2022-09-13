package com.abstract_factory.factory_clients;

import com.abstract_factory.concretes.TWErrorXMLParser;
import com.abstract_factory.concretes.TWFeedbackXMLParser;
import com.abstract_factory.concretes.TWOrderXMLParser;
import com.abstract_factory.concretes.TWResponseXMLParser;
import com.abstract_factory.interfaces.AbstractParserFactory;
import com.abstract_factory.interfaces.XMLParser;

/**
 * 13/SET/2022
 * @author andre
 */
public class TWParserFactory implements AbstractParserFactory{

  @Override
  public XMLParser getParserInstance(String parserType) {
    switch (parserType) {
      case "TWERROR" : return new TWErrorXMLParser();
      case "TWFEEDBACK" : return new TWFeedbackXMLParser();
      case "TWORDER" : return new TWOrderXMLParser();
      case "TWRESPONSE" : return new TWResponseXMLParser();
    }
    return null;
  }
  
}
