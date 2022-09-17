package com.visitor.composite;

import com.visitor.interfaces.Element;
import java.util.List;

/**
 * 08/set/2022
 * @author andre
 * O composite possui uma hierarquia no estilo de árvore.
 * Cada composição pode ter outra composição ou uma folha.
 * A folha é o último nó.
 * Cada nó só pode ter um pai.
 * 
 * Algumas mudanças para atender ao design visitor. 17/set/2022
 */
public abstract class HtmlTag implements Element {
    
    public abstract String getTagName();
    public abstract void setStartTag(String tag);
    public abstract void setEndTag(String tag);
    
    public abstract String getStartTag();
    public abstract String getEndTag();
    
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
