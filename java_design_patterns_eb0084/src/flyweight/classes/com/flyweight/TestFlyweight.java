package com.flyweight;

import com.example.Code;
import com.example.Platform;

/**
 * 12/set/2022
 * @author andrebronca
 */
public class TestFlyweight {
  public static void main(String[] args) {
    Code code = new Code();
    code.setCode("C Code...");
    executeCode("C", code);
    
    code = new Code();
    code.setCode("C Code2...");
    executeCode("C", code);
    
    code = new Code();
    code.setCode("Java Code...");
    executeCode("JAVA", code);
    
    code = new Code();
    code.setCode("Java Code2...");
    executeCode("JAVA", code);
    
    code = new Code();
    code.setCode("Ruby Code...");
    executeCode("RUBY", code);
    
    code = new Code();
    code.setCode("Ruby Code2...");
    executeCode("RUBY", code);
    
  }
  
  private static void executeCode(String platformName, Code code){
    Platform platform = PlatformFactory.getPlatformInstance(platformName);
    platform.execute(code);
    System.out.println("-----------------------------------------");
  }
}
