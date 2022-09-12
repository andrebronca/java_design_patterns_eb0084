package com.chain.responsibility;

/**
 * 12/set/2022
 * @author andrebronca
 */
public class TestChainOfResponsibility {
  public static void main(String[] args) {
    FileToChain file = null;
    Handler textHandler = new TextFileHandler("Text Handler");
    Handler docHandler = new DocFileHandler("Doc Handler");
    Handler excelHandler = new ExcelFileHandler("Excel Handler");
    Handler audioHandler = new AudioFileHandler("Audio Handler");
    Handler videoHandler = new VideoFileHandler(null);
    Handler imageHandler = new ImageFileHandler(null);
    
    textHandler.setHandler(docHandler);
    docHandler.setHandler(excelHandler);
    excelHandler.setHandler(audioHandler);
    audioHandler.setHandler(videoHandler);
    videoHandler.setHandler(imageHandler);
    
    file = new FileToChain("Abc.mp3", "audio", "c:");
    textHandler.process(file);
    
    file = new FileToChain("Abc.jpg", "video", "c:");
    textHandler.process(file);
    
    file = new FileToChain("Abc.doc", "doc", "c:");
    textHandler.process(file);
    
    file = new FileToChain("Abc.bat", "bat", "c:");
    textHandler.process(file);
  }
}
