package com.factory.app;

import com.factory.services.OrderXMLDisplayService;
import com.factory.services.FeedbackXMLDisplayService;
import com.factory.services.ResponseXMLDisplayService;
import com.factory.services.ErrorXMLDisplayService;
import com.factory.abstracts.DisplayService;

/**
 * 13/set/2022
 * @author andre
 */
public class TestFactoryMethodPattern {
  public static void main(String[] args) {
    DisplayService service = new FeedbackXMLDisplayService();
    service.display();
    
    service = new ErrorXMLDisplayService();
    service.display();
    
    service = new OrderXMLDisplayService();
    service.display();
    
    service = new ResponseXMLDisplayService();
    service.display();
  }
}
