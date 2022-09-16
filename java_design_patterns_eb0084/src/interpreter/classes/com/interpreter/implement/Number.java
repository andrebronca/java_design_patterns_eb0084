package com.interpreter.implement;

import com.interpreter.interfaces.Expression;

/**
 * 16/set/2022
 *
 * @author andrebronca
 */
public class Number implements Expression {

  private final int n;

  public Number(int n) {
    this.n = n;
  }

  @Override
  public int interpret() {
    return n;
  }

}
