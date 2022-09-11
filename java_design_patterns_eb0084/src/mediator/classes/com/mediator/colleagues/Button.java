package com.mediator.colleagues;

import com.mediator.interfaces.Colleague;
import com.mediator.interfaces.MachineMediator;

/**
 *
 * @author andrebronca
 */
public class Button implements Colleague{
    
    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }
    
    public void press(){
        System.out.println("Button pressed.");
        mediator.start();
    }
    
}
