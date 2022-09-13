package com.abstract_factory.producer;

import com.abstract_factory.factory_clients.NYParserFactory;
import com.abstract_factory.factory_clients.TWParserFactory;
import com.abstract_factory.interfaces.AbstractParserFactory;

/**
 * 13/set/2022
 * @author andre
 * 
 * Para evitar dependencia entre o código do cliente e os factories, será implementado
 * um factory-producer com static método responsável para fornecer o desejado
 * factory object para o cliente object.
 */
public final class ParserFactoryProducer {
  private ParserFactoryProducer(){
    throw new AssertionError();
  }
  
  public static AbstractParserFactory getFactory(String factoryType){
    //seria melhor que essas strings fossem um Enum
    switch (factoryType) {
      case "NYFactory" : return new NYParserFactory();
      case "TWFactory" : return new TWParserFactory();
    }
    return null;
  }
}
