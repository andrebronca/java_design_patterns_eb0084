package com.abstract_factory.app;

import com.abstract_factory.interfaces.AbstractParserFactory;
import com.abstract_factory.interfaces.XMLParser;
import com.abstract_factory.producer.ParserFactoryProducer;

/**
 * 13/set/2022
 * @author andre
 */
public class TestAbstractFactoryPattern {
  public static void main(String[] args) {
    //essas strings poderiam ser um ENUM
    AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYFactory");
    XMLParser parser = parserFactory.getParserInstance("NYORDER");
    String msg = parser.parse();
    System.out.println(msg);
    System.out.println("....................................");
    
    parserFactory = ParserFactoryProducer.getFactory("TWFactory");
    parser = parserFactory.getParserInstance("TWFEEDBACK");
    msg = parser.parse();
    System.out.println(msg);
  }
}
