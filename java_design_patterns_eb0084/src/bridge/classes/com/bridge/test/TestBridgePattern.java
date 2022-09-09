package com.bridge.test;

import com.bridge.abstracts.Car;
import com.bridge.implement.BigWeel;
import com.bridge.implement.CentralLocking;
import com.bridge.implement.GearLocking;
import com.bridge.implement.Motoren;
import com.bridge.interfaces.Product;

/**
 * 09/set/2022
 * @author andre
 */
public class TestBridgePattern {
    public static void main(String[] args) {
        Product product = new CentralLocking("Central Locking System");
        Product product2 = new GearLocking("Gear Locking System");
        Car car = new BigWeel(product, "BigWhell xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        
        System.out.println();
        
        car = new BigWeel(product2, "BigWhell xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        
        car = new Motoren(product, "Motoren in model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
    }
}
