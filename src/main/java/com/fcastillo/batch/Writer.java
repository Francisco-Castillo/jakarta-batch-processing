/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.batch;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import java.util.List;
import javax.batch.api.chunk.AbstractItemWriter;

/**
 *
 * @author fcastillo
 */
@Dependent
@Named("myWriter")
public class Writer extends AbstractItemWriter {

  @Override
  public void writeItems(List<Object> list) throws Exception {
    System.out.println("Writing items: " + list.toString());
  }

}
