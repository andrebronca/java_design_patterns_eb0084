package com.visitor.composite.concrete;

import com.visitor.composite.HtmlTag;
import com.visitor.interfaces.Visitor;
import java.util.ArrayList;
import java.util.List;

/**
 * 08/set/2022
 *
 * @author andre
 *
 * Alteração para o design Visitor: 17/set/2022
 */
public class HtmlParentElement extends HtmlTag {

  private String tagName;
  private String startTag;
  private String endTag;
  private List<HtmlTag> childrenTag;

  public HtmlParentElement(String tagName) {
    this.tagName = tagName;
    this.startTag = "";
    this.endTag = "";
    this.childrenTag = new ArrayList<>();
  }

  @Override
  public String getTagName() {
    return tagName;
  }

  @Override
  public void setStartTag(String tag) {
    this.startTag = tag;
  }

  @Override
  public void setEndTag(String tag) {
    this.endTag = tag;
  }

  @Override
  public void addChildTag(HtmlTag htmlTag) {
    childrenTag.add(htmlTag);
  }

  @Override
  public void removeChildTag(HtmlTag htmlTag) {
    childrenTag.remove(htmlTag);
  }

  @Override
  public List<HtmlTag> getChildren() {
    return childrenTag;
  }

  @Override
  public void generateHtml() {
    System.out.println(startTag);
    for (HtmlTag tag : childrenTag) {
      tag.generateHtml();
    }
    System.out.println(endTag);
  }

  @Override
  public String getStartTag() {
    return startTag;
  }

  @Override
  public String getEndTag() {
    return endTag;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

}
