package com.state.app;

import com.state.model.Robot;

/**
 * 16/set/2022
 * @author andrebronca
 */
public class TestSatePattern {
  public static void main(String[] args) {
    Robot robot = new Robot();
    robot.walk();
    robot.cook();
    robot.walk();
    robot.off();
    
    robot.walk();
    robot.off();
    robot.cook();
  }
}
