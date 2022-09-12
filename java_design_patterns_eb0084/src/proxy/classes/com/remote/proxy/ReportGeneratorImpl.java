package com.remote.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Date;

/**
 * 11/set/2022
 * @author andrebronca
 * Até o momento não há uma implementação completa para demonstrar: UnicastRemoteObject
 */
public class ReportGeneratorImpl extends UnicastRemoreObject implements ReportGenerator{

    private static final long serialVersionUID = 1L;
    
    protected ReportGeneratorImpl() throws RemoteException {
        
    }
    
    @Override
    public String generateDailyReport() throws RemoteException {
        StringBuilder sb =  new StringBuilder();
        sb.append("*********** Location X Daily Report ********");
        sb.append("\\n Location Id: 012");
        String dataStr = "\\n Totay's Date: "+ new Date();
        sb.append(dataStr);
        sb.append("\\n Total Pizza' Sell: 112");
        sb.append("\\n Total Price: $2534");
        sb.append("\\n Net Profit: $1985");
        sb.append("********************************************");
        return sb.toString();
    }
    
    public static void main(String[] args) {
        try{
            ReportGenerator rg = new ReportGeneratorImpl();
            Naming.rebind("PizzaCoRemoteGenerator", rg);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
