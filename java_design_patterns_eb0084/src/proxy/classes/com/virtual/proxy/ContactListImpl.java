
package com.virtual.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andrebronca
 */
public class ContactListImpl implements ContactList{

    @Override
    public List<Employee> getEmployeeList() {
        return getEmpList();
    }

    private List<Employee> getEmpList() {
        List<Employee> empList = new ArrayList<>();
        
        return empList;
    }
    
}
