package com.template;

/**
 * 13/set/2022
 * @author andrebronca
 * 
 * Considerando o problema onde é necessário inserir dados em banco de dados distintos.
 * Algum arquivo CSV tem que ser inserido em MySQL. Outra situação um arquivo TXT
 * tem que ser inserido em um Oracle.
 * A única diferença são os drivers e os dados em seus tipos de arquivos. O restante
 * dos passos é pra ser o mesmo.
 * Um template se ajusta a essa situação.
 * 
 * Alguns métodos é permitido customizar, outros são definidos. A ordem de execução
 * está fixada para que o trabalho seja concluído em uma sequência lógica.
 */
public abstract class ConnectionTemplate {

  //nenhum cliente dessa classe poderá alterar o método.
  public final void run() {
    setDBDriver();
    setCredentials();
    connect();
    prepareStatement();
    setData();
    insert();
    close();
    destroy();
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
}
