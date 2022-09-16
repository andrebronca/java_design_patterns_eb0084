package com.command.implement;

import com.command.interfaces.Job;
import com.command.job_type.Email;
import com.command.job_type.Sms;

/**
 * 16/set/2022
 *
 * @author andrebronca
 */
public class SmsJob implements Job {

  private Sms sms;

  public void setSms(Sms sms) {
    this.sms = sms;
  }

  @Override
  public void run() {
    System.out.println("Job ID: "+ Thread.currentThread().getId() +" executing sms jobs.");
    if (sms != null){
      sms.sendSms();
    }
    
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

}
