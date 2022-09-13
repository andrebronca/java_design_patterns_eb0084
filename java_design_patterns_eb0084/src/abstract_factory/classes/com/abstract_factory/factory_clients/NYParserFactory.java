package com.abstract_factory.factory_clients;

import com.abstract_factory.interfaces.AbstractParserFactory;
import com.abstract_factory.interfaces.XMLParser;
import com.abstract_factory.concretes.NYErrorXMLParser;
import com.abstract_factory.concretes.NYFeedbackXMLParser;
import com.abstract_factory.concretes.NYOrderXMLParser;
import com.abstract_factory.concretes.NYResponseXMLParser;

/**
 * 13/SET/2022
 * @author andre
 */
public class NYParserFactory implements AbstractParserFactory{

  @Override
  public XMLParser getParserInstance(String parserType) {
    //seria melhor que essas strings fossem um Enum
    switch (parserType) {
      case "NYERROR" : return new NYErrorXMLParser();
      case "NYFEEDBACK" : return new NYFeedbackXMLParser();
      case "NYORDER" : return new NYOrderXMLParser();
      case "NYRESPONSE" : return new NYResponseXMLParser();
    }
    return null;
  }
  
}
