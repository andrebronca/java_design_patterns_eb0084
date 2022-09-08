package com.facade.model;

import com.facade.imodel.Schedule;

/**
 *
 * @author andrebronca
 */
public class ScheduleServer implements Schedule {

    @Override
    public void startBooting() {
        System.out.println("Start: Star booting 1/6");
    }

    @Override
    public void readSystemConfigFile() {
        System.out.println("Start: Read system config file 2/6");
    }

    @Override
    public void init() {
        System.out.println("Start: Init 3/6");
    }

    @Override
    public void initializeContext() {
        System.out.println("Start: Initialize context 4/6");
    }

    @Override
    public void initializeListeners() {
        System.out.println("Start: Initialize listeners 5/6");
    }

    @Override
    public void createSystemObjects() {
        System.out.println("Start: Create system objects 6/6");
    }

    @Override
    public void releaseProcesses() {
        System.out.println("Stop: Release processes 1/6");
    }

    @Override
    public void destroy() {
        System.out.println("Stop: Destroy 2/6");
    }

    @Override
    public void destroySystemObjects() {
        System.out.println("Stop: Destroy system objects 3/6");
    }

    @Override
    public void destroyListeners() {
        System.out.println("Stop: Destroy listeners 4/6");
    }

    @Override
    public void destroyContext() {
        System.out.println("Stop: Destroy context 5/6");
    }

    @Override
    public void shutdown() {
        System.out.println("Stop: Shutdown 6/6");
    }
    
}
