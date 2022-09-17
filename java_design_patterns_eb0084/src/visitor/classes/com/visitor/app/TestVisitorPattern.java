package com.visitor.app;

import com.visitor.composite.HtmlTag;
import com.visitor.composite.concrete.HtmlElement;
import com.visitor.composite.concrete.HtmlParentElement;
import com.visitor.concrete.CssClassVisitor;
import com.visitor.concrete.StyleVisitor;
import com.visitor.interfaces.Visitor;

/**
 * 17/set/2022
 * @author andrebronca
 */
public class TestVisitorPattern {
  public static void main(String[] args) {
    System.out.println("Before visitor....\n");
    HtmlTag parentTag = new HtmlParentElement("<html>");
    parentTag.setStartTag("<html>");
    parentTag.setEndTag("</html>");
    
    HtmlTag p1 = new HtmlParentElement("<body>");
    p1.setStartTag("<body>");
    p1.setEndTag("</body>");
    parentTag.addChildTag(p1);
    
    HtmlTag child1 = new HtmlElement("<p>");
    child1.setStartTag("<p>");
    child1.setEndTag("</p>");
    child1.setTagBody("Testing html tag library");
    p1.addChildTag(child1);
    
    child1 = new HtmlElement("<p>");
    child1.setStartTag("<p>");
    child1.setEndTag("</p>");
    child1.setTagBody("Paragraph 2");
    p1.addChildTag(child1);
    
    parentTag.generateHtml();
    System.out.println(".......................\n After visitor");
    
    Visitor cssClass = new CssClassVisitor();
    Visitor style = new StyleVisitor();
    
    parentTag = new HtmlParentElement("<html>");
    parentTag.setStartTag("<html>");
    parentTag.setEndTag("</html>");
    parentTag.accept(style);
    parentTag.accept(cssClass);
    
    p1 = new HtmlParentElement("<body>");
    p1.setStartTag("<body>");
    p1.setEndTag("</body>");
    p1.accept(style);
    p1.accept(cssClass);
    
    parentTag.addChildTag(p1);
    
    child1 = new HtmlElement("<p>");
    child1.setStartTag("<p>");
    child1.setEndTag("</p>");
    child1.setTagBody("Testing html tag library");
    child1.accept(style);
    child1.accept(cssClass);
    
    p1.addChildTag(child1);
    
    child1 = new HtmlElement("<p>");
    child1.setStartTag("<p>");
    child1.setEndTag("</p>");
    child1.setTagBody("Paragraph 2");
    child1.accept(style);
    child1.accept(cssClass);
    
    p1.addChildTag(child1);
    parentTag.generateHtml();
  }
}
