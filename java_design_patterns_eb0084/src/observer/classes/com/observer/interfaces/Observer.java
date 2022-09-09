package com.observer.interfaces;

/**
 *
 * @author andre
 */
public interface Observer {
    public void update(String desc);
    public void subscribe();
    public void unSubscribe();
}
