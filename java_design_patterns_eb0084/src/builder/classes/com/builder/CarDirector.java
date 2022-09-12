package com.builder;

/**
 * 12/set/2022
 * @author andrebronca
 * Não é implementado pelo livro
 */
public class CarDirector {
  private CarBuilder carBuilder;

  public CarDirector(CarBuilder carBuilder) {
    this.carBuilder = carBuilder;
  }
  
  public void build(){
    carBuilder.buildBodyStyle();
    carBuilder.buildPower();
    carBuilder.buildEngine();
    carBuilder.buildBreaks();
    carBuilder.buildSeats();
    carBuilder.buildWindows();
    carBuilder.buildFuelType();
  }
}
