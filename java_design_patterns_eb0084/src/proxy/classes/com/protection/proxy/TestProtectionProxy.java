package com.protection.proxy;

/**
 * 12/set/2022
 * @author andrebronca
 */
public class TestProtectionProxy {
  public static void main(String[] args) {
    Owner owner = new Owner();
    ReportGeneratorProxy reportGeneratorProxy = new ReportGeneratorProtectionProxy(owner);
    owner.setReportGenerator(reportGeneratorProxy);
    
    Employee employee = new Employee();
    reportGeneratorProxy = new ReportGeneratorProtectionProxy(employee);
    employee.setReportGenerator(reportGeneratorProxy);
    
    System.out.println("For owner:");
    System.out.println(owner.generateDailyReport());
    System.out.println("For employee:");
    System.out.println(employee.generateDailyReport());
  }
}
