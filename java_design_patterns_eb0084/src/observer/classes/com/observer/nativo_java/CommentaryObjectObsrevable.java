package com.observer.nativo_java;

import com.observer.interfaces.Commentary;
import java.util.Observable;

/**
 *
 * @author andre
 * Deprecated desde o java 9.
 * Estou usando o Java 9.
 * Vou deixar registrado para título de pesquisa
 */
public class CommentaryObjectObsrevable extends Observable implements Commentary{
    private String desc;
    private final String subjectDetails;

    public CommentaryObjectObsrevable(String subjectDetails) {
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        setChanged();
        notifyObservers(desc);
    }
    
    public String subjectDetails(){
        return subjectDetails;
    }
    
}
