package com.chain.responsibility;

/**
 * 12/set/2022
 * @author andrebronca
 */
public class DocFileHandler implements Handler{
  
  private Handler handler;
  private String handlerName = "Doc Handler";

  public DocFileHandler(String handlerName) {
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
    if(fileToChain.getFileType().equals("doc")){
      System.out.println();
      System.out.println("Process and saving doc file ... by "+ handlerName);
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
