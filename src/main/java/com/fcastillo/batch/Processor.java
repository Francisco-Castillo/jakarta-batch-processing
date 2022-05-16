/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.batch;

import jakarta.batch.api.chunk.ItemProcessor;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Named;

/**
 *
 * @author fcastillo
 */
@Dependent
@Named("myProcessor")
public class Processor implements ItemProcessor{

  @Override
  public Object processItem(Object o) throws Exception {
    // TODO: No soporta genericos, hay que castear.
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
