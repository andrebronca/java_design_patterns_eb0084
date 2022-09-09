package com.observer.interfaces;

/**
 * Utilizado quando há a necessidade de transmitir uma atualização (informação)
 * para diversos usuários(clientes) interessados em determinado assunto.
 * 
 * @author andre
 */
public interface Subject {
    public void subscribeObserver(Observer observer);
    public void unSubscribeObserver(Observer observer);
    public void notifyObservers();
    public String subjectDetails();
}
