package com.prototype.implementation;

import com.prototype.interfaces.Prototype;

/**
 * 13/set/2022
 * @author andrebronca
 */
public class AccessControl implements Prototype{

  private final String controlLevel;
  private String access;

  public AccessControl(String controlLevel, String access) {
    this.controlLevel = controlLevel;
    this.access = access;
  }
  
  @Override
  public AccessControl clone() throws CloneNotSupportedException {
    try {
      return (AccessControl) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public String getControlLevel(){
    return controlLevel;
  }

  public String getAccess() {
    return access;
  }

  public void setAccess(String access) {
    this.access = access;
  }
  
}
