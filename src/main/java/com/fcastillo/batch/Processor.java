              /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.batch;

import javax.batch.api.chunk.ItemProcessor;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 *
 * @author fcastillo
 */
@Dependent
@Named("myProcessor")
public class Processor implements ItemProcessor{

  @Override
  public String processItem(Object o) throws Exception {
    System.out.println("Procesando... "+o.toString());
    return (String) o;
  }
  
}
