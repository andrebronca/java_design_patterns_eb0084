package com.singleton.example02;

/**
 *
 * @author andre
 * O objeto é criado apenas uma vez.
 * Na primeira chamada é null então será retornado o objeto.
 * Nas próximas chamadas o mesmo objeto é retornado.
 * Porém essa abordagem falha em sistema multi-thread.
 */
public class SingletonLazy {
    private static SingletonLazy sc = null;
    private SingletonLazy(){}
    public static SingletonLazy getInstance(){
        if (sc == null){
            sc = new SingletonLazy();
        }
        return sc;
    }
}
