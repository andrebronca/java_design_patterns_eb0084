package com.builder;

/**
 * 12/set/2022
 * @author andrebronca
 */
public interface CarBuilder {
  public void buildBodyStyle();
  public void buildPower();
  public void buildEngine();
  public void buildBreaks();
  public void buildSeats();
  public void buildWindows();
  public void buildFuelType();
  public Car getCar();
}
