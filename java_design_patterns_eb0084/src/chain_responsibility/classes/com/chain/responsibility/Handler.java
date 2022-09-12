package com.chain.responsibility;


/**
 * 12/set/2022
 * @author andrebronca
 * O Chain responsibility é um padrão em que ao tratar determinado assunto é
 * verificado por um concreto manipulador se ele consegue tratar, caso não, é
 * encaminhado para o próximo da lista, até algum resolver o problema ou chegar 
 * no fim da lista.
 * Ex. Envio de tipos de arquivos diferentes: doc, txt, xls, png, mp3 (etc).
 * O arquivo é recebido e um concreto manipulador verifica se pode tratar o arquivo, 
 * se não puder, encaminha para o próximo manipulador da lista.
 * 
 * Me ocorreu uma situação, não sei se o livro trata isso: Fazer uma forma de enum
 * com uma lista, verificar o tipo do arquivo e enviar direto para o manipulador
 * caso ele não trate, encaminha para o início da lista para verificação encadeada.
 * Caso o manipulador resolva, evita que seja verificado sem necessidade.
 * Mas isso requer uma necessidade de implementação, apenas para deixar registrado.
 */
public interface Handler {
  public void setHandler(Handler handler);
  public void process(FileToChain fileToChain);
  public String getHandlerName();
}
