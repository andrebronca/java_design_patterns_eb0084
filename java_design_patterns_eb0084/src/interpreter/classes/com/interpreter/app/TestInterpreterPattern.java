package com.interpreter.app;

import com.interpreter.implement.ExpressionUtils;
import com.interpreter.interfaces.Expression;
import java.util.Stack;
import com.interpreter.implement.Number;
import java.util.ArrayList;
import java.util.List;

/**
 * 16/set/2022
 *
 * @author andrebronca
 *
 * Agora está funcionando, conforme traz no livro não.
 * Uma ideia de como fazer, bom seria desenvolver expressões complexas. Com 
 * esse modelo já dá pra pensar. 
 */
public class TestInterpreterPattern {

  public static void main(String[] args) {
    List<String> operators = new ArrayList<>();
//    String tokenString = "7 3 - 2 1 + *";
    String tokenString = "7 * 2";
    Stack<Expression> stack = new Stack<>();
    String[] tokenArray = tokenString.split(" ");
    for (String s : tokenArray) {
      if (!ExpressionUtils.isOperator(s)) {
        Expression i = new Number(Integer.parseInt(s));
        stack.push(i);  //coloca o objeto no top da pilha
      } else {
        operators.add(s);
      }
    }

    for (int i = 0; i < stack.size() - 1; i++) {
      Expression rightExp = stack.pop();  //remove o último objeto adicionado
      Expression leftExp = stack.pop();   //remove o último objeto adicionado
      Expression operator = ExpressionUtils.getOperator(operators.get(i), leftExp, rightExp);
      int result = operator.interpret();
      stack.push(new Number(result));
    }

    System.out.println("( " + tokenString + " ): " + stack.pop().interpret());
  }
}
