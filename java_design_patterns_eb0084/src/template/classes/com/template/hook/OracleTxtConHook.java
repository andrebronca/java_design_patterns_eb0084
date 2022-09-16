package com.template.hook;

import com.template.ConnectionTemplate;

/**
 * 13/set/2022
 * @author andrebronca
 */
public class OracleTxtConHook extends ConnectionTemplateHook{

  @Override
  public void setDBDriver() {
    System.out.println("Setting Oracle DB drivers...");
  }

  @Override
  public void setCredentials() {
    System.out.println("Setting credentials for Oracle DB...");
  }

  @Override
  public void setData() {
    System.out.println("Setting up data from txt file...");
  }

  //não preciso sobrescrever o disableLogging, para retornar true,pois
  //por padrão já retorna true.
}
