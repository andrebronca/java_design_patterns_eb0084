package com.template.app;

import com.template.ConnectionTemplate;
import com.template.connections.MySqlCSVCon;
import com.template.connections.OracleTxtCon;

/**
 * 13/set/2022
 *
 * @author andrebronca
 */
public class TestTemplatePattern {

  public static void main(String[] args) {
    System.out.println("------For MySQL...");
    ConnectionTemplate template = new MySqlCSVCon();
    template.run();

    System.out.println("------For Oracle...");
    template = new OracleTxtCon();
    template.run();
  }
}
