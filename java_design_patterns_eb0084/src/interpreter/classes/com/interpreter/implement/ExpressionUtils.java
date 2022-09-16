package com.interpreter.implement;

import com.interpreter.interfaces.Expression;

/**
 * 16/set/2022
 * @author andrebronca
 */
public class ExpressionUtils {
  public static boolean isOperator(String s){
//    if (!s.equals("+") && !s.equals("-") && !s.equals("*")){
//      return false;
//    } else {
//      return true;
//    }
    return (s.equals("+") || s.equals("-") || s.equals("*"));
  }
  
  public static Expression getOperator(String s, Expression left, Expression right){
    switch(s){
      case "+" : return new Add(left, right);
      case "-" : return new Subtract(left, right);
      case "*" : return new Product(left, right);
    }
    return null;
  }
}
