package com.mediator.characteristics;

/**
 *
 * @author andrebronca
 */
public class Sensor {
    public boolean checkTemperature(int temperature){
        System.out.println("Temperature reached "+ temperature +" graus Celsius");
        return true;
    }
}
