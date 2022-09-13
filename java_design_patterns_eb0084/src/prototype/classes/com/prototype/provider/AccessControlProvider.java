package com.prototype.provider;

import com.prototype.implementation.AccessControl;
import java.util.HashMap;
import java.util.Map;

/**
 * 13/set/2022
 * @author andrebronca
 */
public class AccessControlProvider {
  private static Map<String, AccessControl> map = new HashMap<>();
  
  //carrega apenas na primeira vez que a classe é chamada.
  static {
    System.out.println("Fetching data from external resources and creating access control objects...");
    map.put("USER", new AccessControl("USER", "DO_WORK"));
    map.put("ADMIN", new AccessControl("ADMIN", "ADD/REMOVE USERS"));
    map.put("MANAGER", new AccessControl("MANAGER", "GENERATE/READ REPORTS"));
    map.put("VP", new AccessControl("VP", "MODIFY REPORTS"));
  }
  
  public static AccessControl getAccessControl(String controlLevel) throws CloneNotSupportedException{
    AccessControl ac = null;
    ac = map.get(controlLevel);
    if (ac != null){
      return ac.clone();
    }
    return null;
  }
}
