package com.visitor.interfaces;

import com.visitor.composite.concrete.HtmlElement;
import com.visitor.composite.concrete.HtmlParentElement;

/**
 * 17/set/2022
 * @author andrebronca
 */
public interface Visitor {
  public void visit(HtmlElement element);
  public void visit(HtmlParentElement parentElement);
}
