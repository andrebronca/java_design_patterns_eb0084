package com.template.connections;

import com.template.ConnectionTemplate;

/**
 * 13/set/2022
 * @author andrebronca
 */
public class MySqlCSVCon extends ConnectionTemplate{

  @Override
  public void setDBDriver() {
    System.out.println("Setting MySQL DB drivers...");
  }

  @Override
  public void setCredentials() {
    System.out.println("Setting credentials for MySQL DB...");
  }

  @Override
  public void setData() {
    System.out.println("Setting up data from csv file...");
  }
  
}
