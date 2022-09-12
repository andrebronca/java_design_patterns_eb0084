package com.remote.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 11/set/2022
 * @author andrebronca
 * Definindo o método que o cliente pode chamar remotamente.
 * Pode ser retornado qualquer objeto do método.
 */
public interface ReportGenerator extends Remote {
    public String generateDailyReport() throws RemoteException;
}
