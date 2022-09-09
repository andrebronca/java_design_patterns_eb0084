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
 * O produto possui dois sistemas de segurança utilizado pelo carro.
 * Carro é composto por produto.
 * Há dois tipos de carro e cada um pode fazer uso dos tipos de produtos.
 * A bridge ocorre em Car que contém product.
 * Fica fácil criar um novo produto e utilizar pelos tipos de carros e
 * fica fácil criar um novo tipo de carro e utilizar os produtos existentes.
 * Fórmula de combinações: (qtd_tipo_car)^(qtd_tipo_product)
 * Nesse caso há 4 tipos de produtos distintos.
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
