package com.protection.proxy;

import com.remote.proxy.ReportGenerator;
import java.rmi.Naming;

/**
 * 12/set/2022
 * @author andrebronca
 */
public class ReportGeneratorProtectionProxy implements ReportGeneratorProxy{
  
  //não estava sendo utilizado em outro método então deixarei comentado
  //ReportGenerator reportGenerator;
  
  //vou deixar privado
  private Staff staff;

  public ReportGeneratorProtectionProxy(Staff staff) {
    this.staff = staff;
  }
  
  @Override
  public String generateDailyReport() {
    if(staff.isOwner()){
      ReportGenerator reportGenerator = null;
      try {
        reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
        return reportGenerator.generateDailyReport();
      } catch (Exception e) {
        e.printStackTrace();
      }
      return "";
    } else {
      return "Not Authorized to view report.";
    }
  }
  
}
