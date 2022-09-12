/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.virtual.proxy;

/**
 *
 * @author andrebronca
 */
public class Employee {
    private String employeeName;
    private double employeeSalary;
    private String employeeDesignation;

    public Employee(String employeeName, double employeeSalary, String employeeDesignation) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee Name: "+ employeeName
                +" Designation: "+ employeeDesignation
                +" Salary: "+ String.format("%.2f", employeeSalary);
    }
    
    
}
