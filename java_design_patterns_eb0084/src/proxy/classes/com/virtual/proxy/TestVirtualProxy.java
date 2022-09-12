package com.virtual.proxy;

import java.util.List;

/**
 * 12/set/2022
 * @author andrebronca
 */
public class TestVirtualProxy {
  public static void main(String[] args) {
    ContactList contactList = new ContactListProxyImpl();
    Company company = new Company("ABC Company", "India", "+91-011-28458965", contactList);
    System.out.println("Company Name: "+ company.getCompanyName());
    System.out.println("Company Address: "+ company.getCompanyAddress());
    System.out.println("Company Contact No.: "+ company.getCompanyContactNo());
    
    System.out.println("Requesting for contact list");
    
    contactList = company.getContactList();
    
    List<Employee> empList = contactList.getEmployeeList();
    for(Employee e : empList){
      System.out.println(e);
    }
  }
}
