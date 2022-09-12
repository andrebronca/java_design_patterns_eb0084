package com.flyweight;

import com.example.JavaPlatform;
import com.example.Platform;
import java.util.HashMap;
import java.util.Map;

/**
 * 12/set/2022
 * @author andrebronca
 */
public final class PlatformFactory {
  private static Map<String, Platform> map = new HashMap<>();
  private PlatformFactory(){
    throw new AssertionError("Cannot instantiate the class");
  }
  
  public static synchronized Platform getPlatformInstance(String platformType){
    Platform platform = map.get(platformType); //se a chave não for localizada retorna null
    if(platform == null){
      switch (platformType) {
        case "C" : platform = new CPlatform(); break;
        case "CPP" : platform = new CPPPlatform(); break;
        case "JAVA" : platform = new JavaPlatform(); break;
        case "RUBY" : platform = new RubyPlatform(); break;
      }
      map.put(platformType, platform);
    }
    return platform;
  }
}
