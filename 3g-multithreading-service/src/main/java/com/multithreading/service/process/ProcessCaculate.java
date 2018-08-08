package com.multithreading.service.process;

import com.multithreading.service.job.ProcessCaculateJobRunnable;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;

public class ProcessCaculate {
  private static final int parrparallelismThread = 10;
  private static final BlockingQueue<String> queue = new ArrayBlockingQueue(100);

  public static void main(String[] args) throws InterruptedException {
    for (int i = 1; i < 100; i++) {
      queue.put("" + i);
    }
    ForkJoinPool fjp = new ForkJoinPool(parrparallelismThread);
    while (true) {
      String id = queue.take();
      ProcessCaculateJobRunnable job = new ProcessCaculateJobRunnable(id);
      fjp.execute(job);
    }
  }
}
