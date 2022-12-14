package com.command.pool;

import com.command.interfaces.Job;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 16/set/2022
 * @author andrebronca
 */
public class ThreadPool {
  private final BlockingQueue<Job> jobQueue;
  private final Thread[] jobThreads;
  private volatile boolean shutdown;

  public ThreadPool(int n) {
    jobQueue = new LinkedBlockingDeque<>();
    jobThreads = new Thread[n];
    
    for(int i = 0; i < n; i++){
      jobThreads[i] = new Worker("Pool Thread "+ i);
      jobThreads[i].start();
    }
  }
  
  public void addJob(Job job){
    try {
      jobQueue.put(job);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
  
  public void shutdownPool(){
    while(!jobQueue.isEmpty()){
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    shutdown = true;
    for(Thread t : jobThreads){
      t.interrupt();
    }
  }
  
  private class Worker extends Thread {
    public Worker(String name){
      super(name);
    }

    @Override
    public void run() {
      while(!shutdown){
        try {
          Job r = jobQueue.take();
          r.run();
        } catch (InterruptedException e) {
        }
      }
    }
    
    
  }
}
