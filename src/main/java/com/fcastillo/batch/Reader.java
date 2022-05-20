/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.batch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.batch.api.chunk.ItemReader;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import java.io.Serializable;

/**
 *
 * @author fcastillo
 */
@Dependent
@Named("myReader")
public class Reader implements ItemReader {

  private BufferedReader bufferReader;

  @Override
  public void open(Serializable srlzbl) throws Exception {
    bufferReader = new BufferedReader(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("META-INF/user.txt")));
  }

  @Override
  public void close() throws Exception {
    bufferReader.close();
  }

  @Override
  public Object readItem() throws Exception {
    String line = null;
    try {
      line = bufferReader.readLine();
    } catch (Exception e) {
      System.out.println("" + e);
    }

    return line;
  }

  @Override
  public Serializable checkpointInfo() throws Exception {
    // TODO: Se debe implementar una clase para el control
    return null;
  }

}
