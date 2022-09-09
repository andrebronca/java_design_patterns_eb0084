package com.bridge.implement;

import com.bridge.abstracts.Car;
import com.bridge.interfaces.Product;

/**
 * 09/set/2022
 * @author andre
 */
public class BigWeel extends Car{
    
    private final Product product;
    private final String carType;

    public BigWeel(Product product, String carType) {
        super(product, carType);
        this.product = product;
        this.carType = carType;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling "+ product.productName()
            +" for "+ carType);
    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Modifing product "+ product.productName()
            +" according to "+ carType);
    }
    
}
