package com.composite;

/**
 * 08/set/2022
 * @author andre
 */
public class TestCompositePattern {
    public static void main(String[] args) {
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        
        HtmlTag body = new HtmlParentElement("<body>");
        body.setStartTag("<body>");
        body.setEndTag("</body>");
        
        parentTag.addChildTag(body);
        
        HtmlTag p1 = new HtmlElement("<p>");
        p1.setStartTag("<p>");
        p1.setEndTag("</p>");
        p1.setTagBody("Testing html tag library");
        body.addChildTag(p1);
        
        p1 = new HtmlElement("<p>");
        p1.setStartTag("<p>");
        p1.setEndTag("</p>");
        p1.setTagBody("Paragraph 2");
        body.addChildTag(p1);
        
        parentTag.generateHtml();
        
    }
}
