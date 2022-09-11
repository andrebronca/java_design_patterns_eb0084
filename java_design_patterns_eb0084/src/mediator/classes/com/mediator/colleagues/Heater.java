package com.mediator.colleagues;

import com.mediator.interfaces.Colleague;
import com.mediator.interfaces.MachineMediator;

/**
 *
 * @author andrebronca
 */
public class Heater implements Colleague{
    
    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }
    
    public void on(int temperature){
        System.out.println("Heater is on...");
        if (mediator.checkTemperature(temperature)){
            System.out.println("Temperature is set to "+ temperature);
            mediator.off();
        }
    }
    
    public void off(){
        System.out.println("Heater is off...");
        mediator.wash();
    }
}
