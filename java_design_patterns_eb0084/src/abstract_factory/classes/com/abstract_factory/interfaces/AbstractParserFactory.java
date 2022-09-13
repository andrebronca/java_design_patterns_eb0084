package com.abstract_factory.interfaces;

/**
 * 13/set/2022
 * @author andre
 * 
 * Esse padrão resolve o problema quando um cliente possui especificações próprias
 * e não quer mudar. Neste caso a compania tem vários clientes que querem enviar suas
 * próprias especificações em XML.
 * Ex. o cliente NY possui: NYErrorXML, NYFeedbackXML, NYOrderXML, NYResponseXML.
 * O mesmo vale para o cliente TW.
 * 
 * A aplicação precisa receber esses tipos de xml e tratar.
 * 
 * Abstract Factory Pattern in JDK
 * java.util.Calendar#getInstance()
 * java.util.Arrays#asList()
 * java.util.ResourceBundle#getBundle()
 * java.sql.DriverManager#getConnection()
 * java.sql.Connection#createStatement()
 * java.sql.Statement#executeQuery()
 * java.text.NumberFormat#getInstance()
 * javax.xml.transform.TransformerFactory#newInstance()
 */
public interface AbstractParserFactory {
  public XMLParser getParserInstance(String parserType);
}
