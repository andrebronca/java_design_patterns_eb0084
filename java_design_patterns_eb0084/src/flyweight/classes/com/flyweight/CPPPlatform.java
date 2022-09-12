
package com.flyweight;

import com.example.Code;
import com.example.Platform;

/**
 * 12/set/2022
 * @author andrebronca
 */
public class CPPPlatform implements Platform{

  public CPPPlatform() {
    System.out.println("CPPPlatform object created");
  }
  
  @Override
  public void execute(Code code) {
    System.out.println("Compiling and executing CPP code.");
  }
  
}
