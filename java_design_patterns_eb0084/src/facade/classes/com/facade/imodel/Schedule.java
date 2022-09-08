/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.facade.imodel;

/**
 * 08/set/2022
 * @author andrebronca
 * O livro não implementa essa interface
 */
public interface Schedule {
   
    /**
     * Start 1/6
     */
    public void startBooting();
    
    /**
     * Start 2/6
     */
    public void readSystemConfigFile();
    
    /**
     * Start 3/6
     */
    public void init();
    
    /**
     * Start 4/6
     */
    public void initializeContext();
    
    /**
     * Start 5/6
     */
    public void initializeListeners();
    
    /**
     * Start 6/6
     */
    public void createSystemObjects();
    
    /**
     * Stop 1/6
     */
    public void releaseProcesses();
    
    /**
     * Stop 2/6
     */
    public void destroy();
    
    /**
     * Stop 3/6
     */
    public void destroySystemObjects();
    
    /**
     * Stop 4/6
     */
    public void destroyListeners();
    
    /**
     * Stop 5/6
     */
    public void destroyContext();
    
    /**
     * Stop 6/6
     */
    public void shutdown();
}
