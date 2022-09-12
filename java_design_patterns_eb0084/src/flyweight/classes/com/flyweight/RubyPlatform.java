
package com.flyweight;

import com.example.Code;
import com.example.Platform;

/**
 * 12/set/2022
 * @author andrebronca
 */
public class RubyPlatform implements Platform{

  public RubyPlatform() {
    System.out.println("RubyPlatform object created");
  }
  
  @Override
  public void execute(Code code) {
    System.out.println("Compiling and executing Ruby code.");
  }
  
}
