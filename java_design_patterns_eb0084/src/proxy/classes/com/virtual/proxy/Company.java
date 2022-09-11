package com.virtual.proxy;

/**
 * @author andrebronca
 * Demonstração do vitual proxy.
 * Suponha que há uma lista a ser carregada e ela é grande, deixando
 * a aplicação lenta até a conclusão do carregamento.
 * Pode ocorrer da lista nem ser utilizada.
 * É possível como virtual proxy pattern a lista ser carregada apenas
 * quando for necessária, um carregamento posterior, permitindo
 * que a aplicação fique mais rápida.
 */
public class Company {
    private String companyName;
    private String companyAddress;
    private String companyContactNo;
    private ContactList contactList;

    public Company(String companyName, String companyAddress, String companyContactNo, ContactList contactList) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyContactNo = companyContactNo;
        this.contactList = contactList;
        
        System.out.println("Company object created...");
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanyContactNo() {
        return companyContactNo;
    }

    public ContactList getContactList() {
        return contactList;
    }
    
}
