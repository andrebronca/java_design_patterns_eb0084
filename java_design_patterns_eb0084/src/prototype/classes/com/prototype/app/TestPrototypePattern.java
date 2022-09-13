package com.prototype.app;

import com.prototype.domain.User;
import com.prototype.implementation.AccessControl;
import com.prototype.provider.AccessControlProvider;

/**
 * 13/set/2022
 * @author andrebronca
 */
public class TestPrototypePattern {
  public static void main(String[] args) {
    try {
      AccessControl userAccessControl = AccessControlProvider.getAccessControl("USER");
      User user = new User("User A", "USER Level", userAccessControl);
      System.out.println("..........................................");
      System.out.println(user);
      System.out.println("..........................................");
      
      userAccessControl = AccessControlProvider.getAccessControl("USER");
      user = new User("User B", "USER Level", userAccessControl);
      System.out.println("Changing access control of: "+ user.getUserName());
      System.out.println(user);
      user.getAccessControl().setAccess("READ REPORTS");
      System.out.println(user);
      System.out.println("..........................................");
      AccessControl managerAccessControl = AccessControlProvider.getAccessControl("MANAGER");
      user = new User("User C", "MANAGER Level", managerAccessControl);
      System.out.println(user);
      
    } catch (CloneNotSupportedException ex) {
      ex.printStackTrace();
    }
    
  }
}
