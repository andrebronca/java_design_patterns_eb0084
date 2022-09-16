
package com.state.interfaces;

/**
 * 16/set/2022
 * @author andre
 * 
 * No padrão state a classe é referenciada como Context. 
 * O objeto context pode mudar seu comportamento quando há uma mudança no seu
 * estado interno e mantém a classe contexto independente de qualer mudança no status.
 * 
 * No exemplo um Robo pode caminhar e cozinhar e ser desligado. O comportamento vai
 * depender do estado do objeto.
 */
public interface RoboticState {
  public void walk();
  public void cook();
  public void off();
}
