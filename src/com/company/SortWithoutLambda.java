package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithoutLambda {
    public static void main(String[] args) {
        List<Employee> empList = getEmpList();

        System.out.println(" before sort ");
        for (Employee employee: empList) {
            System.out.println(employee.getEmpId()+"    " + employee.getName() +"   " + employee.getSalary());
        }

        //sort
        Collections.sort(empList, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.getEmpId() - e2.getEmpId();
            }
        });

        System.out.println(" after sort ");
        for (Employee employee: empList) {
            System.out.println(employee.getEmpId()+"    " + employee.getName() +"   " + employee.getSalary());
        }



    }
    private static List<Employee> getEmpList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(8,"shiva", new BigDecimal(500)));
        employeeList.add(new Employee(5,"rama",new BigDecimal(100)));
        employeeList.add(new Employee(1,"krishna",new BigDecimal(300)));

        return employeeList;
    }
}
