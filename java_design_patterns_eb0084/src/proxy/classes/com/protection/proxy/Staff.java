package com.protection.proxy;

/**
 * 12/set/2022
 * @author andrebronca
 * O objetivo é permitir que somente o proprietário posso gerar o relatório.
 * Esse projeto tem relação com o que demonstrado em proxy remote, em que o proprietário
 * quer gerar relatório remotamente.
 * Antes de gerar o relatório é verificado se é o proprietário.
 */
public interface Staff {
  public boolean isOwner();
  //se isOwner for true, o setReportGenerator irá receber o relatório
  public void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
