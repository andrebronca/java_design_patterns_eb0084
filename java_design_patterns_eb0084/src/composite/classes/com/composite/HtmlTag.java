package com.composite;

import java.util.List;

/**
 * 08/set/2022
 * @author andre
 * O composite possui uma hierarquia no estilo de árvore.
 * Cada composição pode ter outra composição ou uma folha.
 * A folha é o último nó.
 * Cada nó só pode ter um pai.
 */
public abstract class HtmlTag {
    
    public abstract String getTagName();
    public abstract void setStartTag(String tag);
    public abstract void setEndTag(String tag);
    
    public void setTagBody(String tagBody){
        throw new UnsupportedOperationException("Current operation is not "
                + "support for this object");
    }
    
    public void addChildTag(HtmlTag htmlTag){
        throw new UnsupportedOperationException("Current operation is not "
                + "support for this object");
    }
    
    public void removeChildTag(HtmlTag htmlTag){
        throw new UnsupportedOperationException("Current operation is not "
                + "support for this object");
    }
    
    public List<HtmlTag> getChildren(){
        throw new UnsupportedOperationException("Current operation is not "
                + "support for this object");
    }
    
    public abstract void generateHtml();
}
