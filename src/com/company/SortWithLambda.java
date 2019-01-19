package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithLambda {
    public static void main(String[] args) {
        List<Employee> empList = getEmpList();

        System.out.println(" before sort ");
        for (Employee employee: empList) {
            System.out.println(employee.getEmpId()+"    " + employee.getName() +"   " + employee.getSalary());
        }

        //sort with emp id with LAMBDA
        empList.sort((Employee e1, Employee e2)->e1.getEmpId() - e2.getEmpId());

        //sort with name
        empList.sort((Employee e1, Employee e2)->e1.getName().compareTo(e2.getName()));


        System.out.println(" after LMBDA sort ");
        empList.forEach((employee)->
                System.out.println(employee.getEmpId()+"    " + employee.getName() +"   " + employee.getSalary()));
    }

    private static List<Employee> getEmpList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(8,"shiva", new BigDecimal(500)));
        employeeList.add(new Employee(5,"rama", new BigDecimal(300)));
        employeeList.add(new Employee(1,"krishna", new BigDecimal(100)));

        return employeeList;
    }
}
