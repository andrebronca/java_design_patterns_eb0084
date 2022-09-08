package com.facade;

import com.facade.model.ScheduleServer;

/**
 * 08/set/2022
 * @author andrebronca
 * 
 */
public class TestFacade {
    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);
        
        facadeServer.startServer();
        System.out.println("-------------------");
        System.out.println("After work done ...");
        System.out.println("-------------------");
        facadeServer.stopServer();
    }
}
