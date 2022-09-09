package com.singleton.example01;

/**
 * Quando utilizar singleton: quando for necessário apenas uma instância
 * de determinado objeto.
 * Utilizei em conexão de BD. Cada consulta é aberta e fechada, mas a conexão
 * é única para toda a aplicação.
 * 
 * @author andre
 * Singleton exibe que tenha apenas um objeto, então o construtor padrão
 * deve ser declarado como private, para evitar a instanciação de um novo objeto
 * em vez do uso do objeto estático.
 * Para evitar o uso do atributo, este deve ser privado e fornecido um
 * método para obter a instância.
 * O problema aqui é que o objeto será criado mas pode nunca ser usado.
 */
public class SingletonEager {
    private static SingletonEager sc = new SingletonEager();
    private SingletonEager(){}
    public static SingletonEager getInstance(){
        return sc;
    }
}
