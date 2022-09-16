package com.template.hook;

/**
 * 16/set/2022
 * @author andre
 */
public class TestTemplatePatternHook {
  public static void main(String[] args) {
    System.out.println("For MySQL...");
    ConnectionTemplateHook template = new MySqlCSVConHook();
    template.run();
    System.out.println("--------------------------------");
    System.out.println("For Oracle...");
    template = new OracleTxtConHook();
    template.run();
  }
}
