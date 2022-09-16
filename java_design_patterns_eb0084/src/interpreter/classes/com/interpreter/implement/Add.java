package com.interpreter.implement;

import com.interpreter.interfaces.Expression;

/**
 * 16/set/2022
 *
 * @author andrebronca
 */
public class Add implements Expression {

  private final Expression leftExpression;
  private final Expression rightExpression;

  public Add(Expression leftExpression, Expression rightExpression) {
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  @Override
  public int interpret() {
    return leftExpression.interpret() + rightExpression.interpret();
  }

}
