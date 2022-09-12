package com.builder;

/**
 * 12/set/2022
 * @author andrebronca
 */
public class TestBuildPattern {
  public static void main(String[] args) {
    CarBuilder carBuilder = new SedanCarBuilder();
    CarDirector director = new CarDirector(carBuilder);
    director.build();
    Car car = carBuilder.getCar();
    System.out.println(car);
    
    carBuilder = new SportsCarBuilder();
    director = new CarDirector(carBuilder);
    director.build();
    car = carBuilder.getCar();
    System.out.println(car);
  }
}
