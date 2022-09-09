package com.singleton.example03;

/**
 *
 * @author andre
 * Essa abordagem é para sistemas multi-thread.
 * O uso de synchronized é para evitar que mais de uma thread gere objeto distinto
 * A sincronização caua um pouco de lentidão pois alguma thread terá que esperar,
 * se isso não for um problema, pode ser utilizada essa abordagem.
 */
public class SingletonLazyMultithread {
    private static SingletonLazyMultithread sc = null;
    private SingletonLazyMultithread(){}
    public static synchronized SingletonLazyMultithread getInstance(){
        if (sc == null){
            sc = new SingletonLazyMultithread();
        }
        return sc;
    }
}
