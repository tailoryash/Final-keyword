package com.yash.finalKeyword;

import com.yash.finalKeyword.company.Employee;

public class Main extends Employee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.employeeDetails();

//        if we try to re-assign value of final instance variable - throws an error
//        error-message    java: cannot assign a value to final variable EMPLOYEE_ID
//
//        emp.EMPLOYEE_ID = 12232

//        If can't override final method, gives an error - illegal start of expression
//        public final void employeeDetails(){
//            System.out.println("method override");
//        }
    }
}
