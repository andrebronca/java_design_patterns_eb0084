package com.chain.responsibility;

/**
 * 12/set/2022
 * @author andrebronca
 */
public class AudioFileHandler implements Handler{
  
  private Handler handler;
  private String handlerName = "Audio Handler";

  /**
   * 
   * @param handlerName se null atribui o valor padrão <br>
   * Handler Name padrão: <b>Audio Handler</b>
   */
  public AudioFileHandler(String handlerName) {
    if (handlerName != null){
      this.handlerName = handlerName;
    }
  }
  
  @Override
  public void setHandler(Handler handler) {
    this.handler = handler;
  }

  @Override
  public void process(FileToChain fileToChain) {
    if(fileToChain.getFileType().equals("audio")){
      System.out.println();
      System.out.println("Process and saving audio file... by "+ handlerName);
    } else if (handler != null){
      System.out.println(handlerName +" forwards request to "+ handler.getHandlerName());
      handler.process(fileToChain);
    } else {
      System.out.println("File not supported");
    }
  }

  @Override
  public String getHandlerName() {
    return handlerName;
  }
  
}
