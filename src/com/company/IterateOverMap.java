package com.company;

import com.sun.istack.internal.NotNull;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class IterateOverMap {
    public static void main(String[] args) {

        @NotNull
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(500,new Employee(1, "gade", new BigDecimal(50000)));
        employeeMap.put(501,new Employee(2, "rama", new BigDecimal(11000)));
        employeeMap.put(502,new Employee(3, "krishna", new BigDecimal(22500)));
        employeeMap.put(503,new Employee(4, "hari", new BigDecimal(3300)));
        employeeMap.put(504,new Employee(5, null, new BigDecimal(500)));

        System.out.println("printing map with forEach ");
        employeeMap.forEach((k, v)->System.out.println("key "+ k + " value "+ v));

        System.out.println("printing map with forEach with some logic");
        employeeMap.forEach((k, v)->  {
            System.out.println("in for each ");
            if ("some".equalsIgnoreCase(v.getName())) {
                System.out.println("Hello "+v.getName());

            } else {
                System.out.println("no match");
            }
        });
    }
}
