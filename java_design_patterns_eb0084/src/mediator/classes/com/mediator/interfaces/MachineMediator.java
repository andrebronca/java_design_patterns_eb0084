package com.mediator.interfaces;

/**
 * 11/set/2022
 * @author andrebronca
 * O uso do mediator é para deixar um baixo acoplamento e fácil manutenabilidade.
 * A comunicação é feita com o mediator que sabe se comunicar com outras classes.
 * 
 * Exemplo aplicado a máquina de lavar que possui diversos componentes e tratamentos
 * diferentes para o tipo de roupa.
 * Qual tipo de roupa está lavando, quais produtos podem ser utilizados, qual é
 * a temperatura da água, qual é o volume de água, qual é a rotação do tambor.
 * Máquinas diferentes podem ter características distintas.
 * O processo de utilização tem que ser o mais simples possível para o usuário.
 * 
 * Esta classe atua como um mediator genérico.
 */

public interface MachineMediator {
    public void start();
    public void wash();
    public void open();
    public void closed();
    public void on();
    public void off();
    public boolean checkTemperature(int temperature);
}
