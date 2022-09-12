
package com.virtual.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andrebronca
 * Uma aplicação real aqui poderia trazer milhares de registros
 * tornando a aplicação lenta.
 * Essa lista será carregada apenas quando for necessária.
 * Para evitar que durante a inicialização a aplicação fique lenta.
 */
public class ContactListImpl implements ContactList{

    @Override
    public List<Employee> getEmployeeList() {
        return getEmpList();
    }

    /*como se fosse uma consulta ao banco de dados
    * se mantém privado para que não ocorra outra chamada.
    */
    private List<Employee> getEmpList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Employee A", 2565.55, "SE"));
        employeeList.add(new Employee("Employee B", 22574, "Manager"));
        employeeList.add(new Employee("Employee C", 3256.77, "SSE"));
        employeeList.add(new Employee("Employee D", 4875.54, "SSE"));
        employeeList.add(new Employee("Employee E", 2847.01, "SE"));
        return employeeList;
    }
    
}
