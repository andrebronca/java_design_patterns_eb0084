package com.facade;

import com.facade.model.ScheduleServer;

/**
 * 08/set/2022
 * @author andrebronca
 * O Facade cria uma camada para simplificar o processo, não oculta a camada complexa.
 * Os procedimentos complexos ficam centralizados e concentrados.
 * Cliente que precisa de simplicidade, utiliza o facade.
 * Cliente que precisa acompanhar os processos, continua utilizando a 
 * camada complexa.
 * O facade promove independencia e portabilidade.
 */
public class ScheduleServerFacade {
   
    private final ScheduleServer scheduleServer;
    
    public ScheduleServerFacade(ScheduleServer scheduleServer){
        this.scheduleServer = scheduleServer;
    }
    
    public void startServer(){
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
    }
    
    public void stopServer(){
        scheduleServer.releaseProcesses();
        scheduleServer.destroy();
        scheduleServer.destroySystemObjects();
        scheduleServer.destroyListeners();
        scheduleServer.destroyContext();
        scheduleServer.shutdown();
    }
}
