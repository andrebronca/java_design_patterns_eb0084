package com.command.app;

import com.command.implement.EmailJob;
import com.command.implement.FileIOJob;
import com.command.implement.LoggingJob;
import com.command.implement.SmsJob;
import com.command.job_type.Email;
import com.command.job_type.FileIO;
import com.command.job_type.Logging;
import com.command.job_type.Sms;
import com.command.pool.ThreadPool;

/**
 * 16/set/2022
 * @author andrebronca
 */
public class TestCommandPattern {
  public static void main(String[] args) {
    init();
  }
  
  private static void init(){
    ThreadPool pool = new ThreadPool(10);
    
    Email email = null;
    EmailJob emailJob = new EmailJob();
    
    Sms sms = null;
    SmsJob smsJob = new SmsJob();
    
    FileIO fileIO = null;
    FileIOJob fileIOJob = new FileIOJob();
    
    Logging logging = null;
    LoggingJob logJob = new LoggingJob();
    
    for(int i = 0; i < 5; i++){
      email = new Email();
      emailJob.setEmail(email);
      
      sms = new Sms();
      smsJob.setSms(sms);
      
      fileIO = new FileIO();
      fileIOJob.setFileIO(fileIO);
      
      logging = new Logging();
      logJob.setLogging(logging);
      
      pool.addJob(emailJob);
      pool.addJob(smsJob);
      pool.addJob(fileIOJob);
      pool.addJob(logJob);
    }
    pool.shutdownPool();
  }
}
