
package com.flyweight;

import com.example.Code;
import com.example.Platform;

/**
 * 12/set/2022
 * @author andrebronca
 */
public class CPlatform implements Platform{

  public CPlatform() {
    System.out.println("CPlatform object created");
  }
  
  @Override
  public void execute(Code code) {
    System.out.println("Compiling and executing C code.");
  }
  
}
