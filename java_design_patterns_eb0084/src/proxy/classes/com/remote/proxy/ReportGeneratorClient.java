package com.remote.proxy;

import java.rmi.Naming;

/**
 * 11/set/2022
 * @author andrebronca
 */
public class ReportGeneratorClient {
    public static void main(String[] args) {
        new ReportGeneratorClient().generateReport();
    }
    
    public void generateReport(){
        try {
            ReportGenerator rg = (ReportGenerator) Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
            System.out.println(rg.generateDailyReport());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
