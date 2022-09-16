package com.state.implement;

import com.state.interfaces.RoboticState;
import com.state.model.Robot;

/**
 * 16/set/2022
 *
 * @author andrebronca
 */
public class RoboticOn implements RoboticState {

  private final Robot robot;

  public RoboticOn(Robot robot) {
    this.robot = robot;
  }

  @Override

  public void walk() {
    System.out.println("Walking...");
  }

  @Override
  public void cook() {
    System.out.println("Cooking...");
    robot.setRoboticState(robot.getRoboticCook());
  }

  @Override
  public void off() {
    robot.setState(robot.getRoboticOff());
    System.out.println("Robot is switched off");
  }

}
