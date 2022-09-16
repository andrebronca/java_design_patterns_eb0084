package com.strategy.app;

import com.strategy.context.TextEditor;
import com.strategy.implement.CapTextFormatter;
import com.strategy.implement.LowerTextFormatter;
import com.strategy.interfaces.TextFormater;

/**
 * 16/set/2022
 * @author andrebronca
 */
public class TestStrategyPattern {
  public static void main(String[] args) {
    TextFormater formatter = new CapTextFormatter();
    TextEditor editor = new TextEditor(formatter);
    editor.publishText("Testing text in caps formatter");
    
    formatter = new LowerTextFormatter();
    editor = new TextEditor(formatter);
    editor.publishText("Testing text in lower formatter");
  }
}
