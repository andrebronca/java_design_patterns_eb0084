package com.factory.interfaces;

/**
 * 13/set/2022
 * @author andre
 * A demonstração aqui é como receber diferentes tipos de XML e exibir na aplicação.
 * Cada tipo de XML tem uma configuração específica de tags. A aplicação tem que
 * ter condições de exibir o conteúdo desses tipos. Não é possível saber qual
 * tipo de XML virá, o que chegar tem que ser tratado.
 * 
 * Factory method pattern in jdk
 * java.util.Calendar#getInstance()
 * java.util.ResourceBundle#getBundle()
 * java.text.NumberFormat#getInstance()
 * java.nio.charset.Charset#forName()
 * java.net.URLStreamHandlerFactory#createURLStreamhandler(String)
 */
public interface XMLParser {
    public String parse();
}
