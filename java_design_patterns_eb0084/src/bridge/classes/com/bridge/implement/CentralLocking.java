package com.bridge.implement;

import com.bridge.interfaces.Product;

/**
 * 09/set/2022
 * @author andre
 */
public class CentralLocking implements Product{

    private final String productName;

    public CentralLocking(String productName) {
        this.productName = productName;
    }
    
    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System: "+ productName);
    }    
}
