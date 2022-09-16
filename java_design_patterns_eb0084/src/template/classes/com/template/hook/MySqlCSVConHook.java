package com.template.hook;

import com.template.ConnectionTemplate;

/**
 * 16/set/2022
 * @author andrebronca
 */
public class MySqlCSVConHook extends ConnectionTemplateHook{

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

  /**
   * Aqui está desativando o logg
   * @return 
   */
  @Override
  public boolean disableLogging() {
    return false;
  }
  
  
}
