package com.template.hook;

import java.util.Date;

/**
 * 14/set/2022
 *
 * @author andrebronca
 *
 * Demonstrando um método gancho (hook) Algum cliente quer um log para análise,
 * enquanto outro não, então é possível exibir ou não o log.
 * 
 * template in Jdk
 * java.util.Collections#sort()
 * java.io.InputStream#skip()
 * java.io.InputStream#read()
 * java.util.AbstractList#indexOf()
 */
public abstract class ConnectionTemplateHook {

  private boolean isLoggingEnable = true;

  public ConnectionTemplateHook() {
    //o método pode ser sobreposto caso o cliente não queira exibir o logg
    isLoggingEnable = disableLogging();
  }

  //nenhum cliente dessa classe poderá alterar o método.
  public final void run() {
    setDBDriver();
    logging("Drivers set [" + new Date() + "]");
    setCredentials();
    logging("Credentials set [" + new Date() + "]");
    connect();
    logging("Connected");
    prepareStatement();
    logging("Statement prepared [" + new Date() + "]");
    setData();
    logging("Data set [" + new Date() + "]");
    insert();
    logging("Inserted set [" + new Date() + "]");
    close();
    logging("Connections closed [" + new Date() + "]");
    destroy();
    logging2("Destroy", false);
    logging2("Object destroyed", true);
  }

  //força o cliente a fazer a implementação.
  public abstract void setDBDriver();

  public abstract void setCredentials();

  public abstract void setData();

  public void connect() {
    System.out.println("Setting connection...");
  }

  public void prepareStatement() {
    System.out.println("Preparing insert statement...");
  }

  public void insert() {
    System.out.println("Inserting data...");
  }

  public void close() {
    System.out.println("Closing connections...");
  }

  public void destroy() {
    System.out.println("Destroying connection objects...");
  }

  public boolean disableLogging() {
    return true;
  }

  private void logging(String msg) {
    if (isLoggingEnable) {
      System.out.println("Logging...: " + msg);
    }
  }

  /**
   * Uma alternativa para deixar mais clean o método run
   *
   * @param msg mensagem que deseja exibir
   * @param exibeDateTime se true irá exibir
   */
  private void logging2(String msg, boolean exibeDateTime) {
    if (isLoggingEnable) {
      if (exibeDateTime) {
        System.out.println(msg + "[" + new Date() + "]");
      } else {
        System.out.println(msg);
      }
    }
  }
}
