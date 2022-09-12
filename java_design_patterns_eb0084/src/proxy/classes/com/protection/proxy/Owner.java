package com.protection.proxy;

/**
 * 12/set/2022
 * @author andrebronca
 */
public class Owner implements Staff{
  
  private boolean isOwner = true;
  private ReportGeneratorProxy reportGenerator;
  
  @Override
  public boolean isOwner() {
    return isOwner;
  }
  
  public String generateDailyReport(){
    try {
      return reportGenerator.generateDailyReport();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "";
  }

  @Override
  public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
    this.reportGenerator = reportGenerator;  
  }
  
}
