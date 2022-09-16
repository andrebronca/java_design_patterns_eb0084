package com.state.implement;

import com.state.interfaces.RoboticState;
import com.state.model.Robot;

/**
 * 16/set/2022
 *
 * @author andrebronca
 */
public class RoboticOff implements RoboticState {

  private final Robot robot;

  public RoboticOff(Robot robot) {
    this.robot = robot;
  }

  @Override

  public void walk() {
    System.out.println("Walking...");
    robot.setRoboticState(robot.getRoboticOn());
  }

  @Override
  public void cook() {
    System.out.println("Cannot cook at Off state.");
  }

  @Override
  public void off() {
    System.out.println("Alread switched off");
  }

}
