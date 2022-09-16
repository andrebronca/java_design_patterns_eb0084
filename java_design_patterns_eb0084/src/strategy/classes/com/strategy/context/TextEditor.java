package com.strategy.context;

import com.strategy.interfaces.TextFormater;

/**
 * 16/set/2022
 * @author andrebronca
 */
public class TextEditor {
  private final TextFormater textFormater;

  public TextEditor(TextFormater textFormater) {
    this.textFormater = textFormater;
  }
  
  public void publishText(String text){
    textFormater.format(text);
  }
}
