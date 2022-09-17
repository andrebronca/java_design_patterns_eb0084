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
public class StyleVisitor implements Visitor{

  @Override
  public void visit(HtmlElement element) {
    element.setStartTag( replaceStartTag(element.getStartTag(), 46));
  }

  @Override
  public void visit(HtmlParentElement parentElement) {
    parentElement.setStartTag( replaceStartTag(parentElement.getStartTag(), 58));
  }
  
  private String replaceStartTag(String startTag, int w){
    return startTag.replace(">", " style='width:"+ w +"px;'>");
  }
  
}
