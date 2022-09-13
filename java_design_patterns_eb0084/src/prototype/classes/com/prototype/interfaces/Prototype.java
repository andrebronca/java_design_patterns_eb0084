package com.prototype.interfaces;

import com.prototype.implementation.AccessControl;

/**
 * 13/set/2022
 * @author andrebronca
 * 
 * Algumas vezes a criação de objetos pesados pode ter um custo alto e a aplicação
 * precisa de muitos desses tipos de objetos (contendo similar propriedades), isso pode
 * comprometer a performance da aplicação.
 * Considerar o cenário onde uma aplicação requer controle de acesso. Alguns usuários
 * possuem acesso a relatórios enquanto outros não. Alguns podem modificar relatórios enquanto
 * outros somente leem. Alguns usuários têm acesso administrativo e adicionam ou removem
 * outros usuários.
 * Todo objeto de usuário tem um objeto de controle de acesso, que é usado para fornecer
 * as restrições de controle da aplicação. Esse objeto de controle é volumoso, um objeto
 * pesado e sua criação é cara desde que requeira dados de recursos externos como
 * banco de dados ou algum arquivo de propriedades.
 * 
 * Pode ser usado Prototype Design Pattern para resolver esse problema, criando os objetos
 * de controle de acesso de todos os níveis de uma vez.
 * O conceito é para copiar um objeto existente ao invés de criar uma nova instância do zero, 
 * por causa do custo de criação.
 * 
 * in JDK
 * ﻿java.lang.Object#clone()
 * java.lang.Cloneable
 */
public interface Prototype extends Cloneable {
  public AccessControl clone() throws CloneNotSupportedException;
}
