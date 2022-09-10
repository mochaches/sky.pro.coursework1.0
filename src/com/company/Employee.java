package com.company;

public class Employee {

    private int id;
    private String fullName;
    private int department;
    private double salary;
    private static int counter;

    public Employee(String fullName, int department, double salary) {
        if (department < 0 || department > 5) throw new IllegalArgumentException("Введено невалидное значение department");
        this.id = ++counter;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        if (department < 0 || department > 5) throw new IllegalArgumentException("Введено невалидное значение");
            this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public static int getCounter() {
        return counter;
    }
}
