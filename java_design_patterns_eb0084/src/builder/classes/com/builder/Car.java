package com.builder;

/**
 * 12/set/2022
 * @author andrebronca
 */
public class Car {
  private String bodyStyle;
  private String power;
  private String engine;
  private String breaks;
  private String seats;
  private String windows;
  private String fuelType;
  private String carType;

  /**
   * 
   * @param carType String
   */
  public Car(String carType) {
    this.carType = carType;
  }

  /**
   * @return the bodyStyle
   */
  public String getBodyStyle() {
    return bodyStyle;
  }

  /**
   * @param bodyStyle the bodyStyle to set
   */
  public void setBodyStyle(String bodyStyle) {
    this.bodyStyle = bodyStyle;
  }

  /**
   * @return the power
   */
  public String getPower() {
    return power;
  }

  /**
   * @param power the power to set
   */
  public void setPower(String power) {
    this.power = power;
  }

  /**
   * @return the engine
   */
  public String getEngine() {
    return engine;
  }

  /**
   * @param engine the engine to set
   */
  public void setEngine(String engine) {
    this.engine = engine;
  }

  /**
   * @return the breaks
   */
  public String getBreaks() {
    return breaks;
  }

  /**
   * @param breaks the breaks to set
   */
  public void setBreaks(String breaks) {
    this.breaks = breaks;
  }

  /**
   * @return the seats
   */
  public String getSeats() {
    return seats;
  }

  /**
   * @param seats the seats to set
   */
  public void setSeats(String seats) {
    this.seats = seats;
  }

  /**
   * @return the windows
   */
  public String getWindows() {
    return windows;
  }

  /**
   * @param windows the windows to set
   */
  public void setWindows(String windows) {
    this.windows = windows;
  }

  /**
   * @return the fuelType
   */
  public String getFuelType() {
    return fuelType;
  }

  /**
   * @param fuelType the fuelType to set
   */
  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("--------------"+ carType +"--------------\n");
    sb.append(" Body: ");
    sb.append(bodyStyle);
    sb.append("\n Power: ");
    sb.append(power);
    sb.append("\n Breaks: ");
    sb.append(breaks);
    sb.append("\n Seats: ");
    sb.append(seats);
    sb.append("\n Windows: ");
    sb.append(windows);
    sb.append("\n Fuel Type: ");
    sb.append(fuelType);
    return sb.toString();
  }
  
  
}
