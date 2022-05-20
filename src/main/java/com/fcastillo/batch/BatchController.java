/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.batch;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author fcastillo
 */
@RequestScoped
@Named
public class BatchController {

  public void run() {
    try {
      JobOperator jobOperator = BatchRuntime.getJobOperator();
      jobOperator.start("job", null);
    } catch (Exception e) {
      System.out.println("Error: " + e.getLocalizedMessage());
    }
  }

}
