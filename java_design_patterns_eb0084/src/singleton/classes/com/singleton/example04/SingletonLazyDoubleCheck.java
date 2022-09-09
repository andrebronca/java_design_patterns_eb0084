package com.singleton.example04;

/**
 *
 * @author andre
 * Faz o uso de sincronização, na mesma ideia do exemplo anterior, porém,
 * faz uma dupla verificação e só faz a sincronização uma vez.
 * Com isso há uma melhora na performance.
 */
public class SingletonLazyDoubleCheck {
    private volatile static SingletonLazyDoubleCheck sc = null;
    private SingletonLazyDoubleCheck(){}
    public static SingletonLazyDoubleCheck getInstance(){
        if (sc == null){
            synchronized (SingletonLazyDoubleCheck.class) {
                if (sc == null){
                     sc = new SingletonLazyDoubleCheck();
                }
            }
        }
        return sc;
    }
}
