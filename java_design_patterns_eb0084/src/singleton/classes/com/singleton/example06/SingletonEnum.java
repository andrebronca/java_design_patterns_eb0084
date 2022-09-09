package com.singleton.example06;

/**
 *
 * @author andre
 * Constants enum são implicitamente static e final, e não é possível mudar
 * o valor depois de criada.
 * Enums são thread-safe.
 * Constants enum nunca são clonadas.
 * Enums são serializados
 * Instanciação usando reflection é proibida
 */
public class SingletonEnum {
    public enum SingleEnum {
        SINGLETON_ENUM;
    }
}
