package com.visitor.concrete;

import com.visitor.composite.concrete.HtmlElement;
import com.visitor.composite.concrete.HtmlParentElement;
import com.visitor.interfaces.Visitor;

/**
 * 17/set/2022
 * @author andrebronca
 * 
 * fiz uma alteração, adicionei o método private.
 */
public class CssClassVisitor implements Visitor{
  private final String CLASS_NAME = "visitor";

  @Override
  public void visit(HtmlElement element) {
    element.setStartTag( replaceStartTag(element.getStartTag()));
  }

  @Override
  public void visit(HtmlParentElement parentElement) {
    parentElement.setStartTag( replaceStartTag(parentElement.getStartTag()));
  }
  
  private String replaceStartTag(String startTag){
    return startTag.replace(">", " class='"+ CLASS_NAME +"'>");
  }
  
}
