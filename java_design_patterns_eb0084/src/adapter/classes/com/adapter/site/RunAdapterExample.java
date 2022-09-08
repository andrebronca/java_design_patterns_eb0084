package com.adapter.site;

import com.adapter.payd.PayD;
import com.adapter.xpay.Xpay;

/**
 * 08/set/2022
 * @author andrebronca
 * 
 */
public class RunAdapterExample {
    public static void main(String[] args) {
        //object for Xpay
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)235);
        xpay.setAmount(2565.23);
        
        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);
    }
    
    private static void testPayD(PayD payD){
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
 
}
