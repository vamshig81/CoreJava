package com.company;

import java.io.Serializable;
import java.math.BigDecimal;

public class Employee implements Serializable {

    private int empId;
    private String name;
    private BigDecimal salary;

    public Employee(int empId, String name, BigDecimal salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
