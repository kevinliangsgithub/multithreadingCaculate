package com.multithreading.service.job;

import java.io.Serializable;

public class ProcessCaculateJobRunnable implements Runnable, Serializable {

  private static final long serialVersionUID = 4030506979569818074L;
  private String entperpriseId;

  public ProcessCaculateJobRunnable(String entperpriseId) {
    this.entperpriseId = entperpriseId;
  }

  @Override
  public void run() {
    System.out.println(String.format("id:%s,execute over!", entperpriseId));
  }
}
