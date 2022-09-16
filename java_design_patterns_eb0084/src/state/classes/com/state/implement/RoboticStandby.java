package com.state.implement;

import com.state.interfaces.RoboticState;
import com.state.model.Robot;

/**
 * 16/set/2022
 *
 * @author andrebronca
 */
public class RoboticStandby implements RoboticState {

  private final Robot robot;

  public RoboticStandby(Robot robot) {
    this.robot = robot;
  }

  @Override
  public void walk() {
    System.out.println("In standby state...");
    robot.setRoboticState(robot.getRoboticOn());
    System.out.println("Walking...");
  }

  @Override
  public void cook() {
    System.out.println("In standby state...");
    robot.setRoboticState(robot.getRoboticCook());
    System.out.println("Cooking...");
  }

  @Override
  public void off() {
    System.out.println("In standby state...");
    robot.setState(robot.getRoboticOff());
    System.out.println("Robot is switched off");
  }

}
