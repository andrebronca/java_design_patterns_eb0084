package com.adapter.payd;

/**
 * 08/set/2022
 * @author andrebronca
 * Esta outra interface será a padrão do sistema, então será necessário 
 * implementar de uma forma que cause o mínimo impacto na aplicação.
 */
public interface PayD {
    public String getCustCardNo();
    public String getCardOwnerName();
    public String getCardExpMonthDate();
    public Integer getCVVNo();
    public Double getTotalAmount();
    
    public void setCustCardNo(String custCardNo);
    public void setCardOwnerName(String cardOwnerName);
    public void setCardExpMonthDate(String cardExpMonthDate);
    public void setCVVNo(Integer cVVNo);
    public void setTotalAmount(Double totalAmount);
}
