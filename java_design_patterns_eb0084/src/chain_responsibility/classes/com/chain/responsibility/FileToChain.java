package com.chain.responsibility;

/**
 * 12/set/2022
 * @author andrebronca
 * Mudei o nome da classe para evitar confusão com a classe java.io.File
 */
public class FileToChain {
  private final String fileName;
  private final String fileType;
  private final String filePath;

  public FileToChain(String fileName, String fileType, String filePath) {
    this.fileName = fileName;
    this.fileType = fileType;
    this.filePath = filePath;
  }

  public String getFileName() {
    return fileName;
  }

  public String getFileType() {
    return fileType;
  }

  public String getFilePath() {
    return filePath;
  }
  
}
