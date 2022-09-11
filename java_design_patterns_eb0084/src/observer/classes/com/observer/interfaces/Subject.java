package com.observer.interfaces;

/**
 * Utilizado quando há a necessidade de transmitir uma atualização (informação)
 * para diversos usuários(clientes) interessados em determinado assunto.
 * 
 * @author andre
 * 
 * Nesse exemplo no módulo ocorre: usuários se inscrevem em algum assunto de interesse.
 * Os comentaristas, publicam os comentários, cada novo comentário é enviado para todos
 * os interessados.
 * Um cliente pode fazer cadastro e cancelar seu cadastro.
 */
public interface Subject {
    public void subscribeObserver(Observer observer);
    public void unSubscribeObserver(Observer observer);
    public void notifyObservers();
    public String subjectDetails();
}
