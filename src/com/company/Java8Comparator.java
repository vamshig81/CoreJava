package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Java8Comparator {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(3,"shiva", new BigDecimal(200.00)));
        employeeList.add(new Employee(2,"krishna", new BigDecimal(300.00)));
        employeeList.add(new Employee(1,"rama", new BigDecimal(100)));

        employeeList.sort((Employee e1, Employee e2)->e1.getEmpId()-e2.getEmpId());
        System.out.println("Sort by EmpID ");
        employeeList.stream().forEach((element)->System.out.println(element.getEmpId()+" "+element.getName() +"     "+ element.getSalary()));

        System.out.println("Sort by Emp Name ");
        employeeList.sort((Employee e1, Employee e2)->e1.getName().compareTo(e2.getName()));
        employeeList.stream().forEach((element)->System.out.println(element.getEmpId()+" "+element.getName() +"     "+ element.getSalary()));

        System.out.println("Sort by salary ");
        employeeList.sort((Employee e1, Employee e2)->e1.getSalary().compareTo(e2.getSalary()));
        employeeList.stream().forEach((element)->System.out.println(element.getEmpId()+" "+element.getName() +"     "+ element.getSalary()));

    }

}