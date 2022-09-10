package com.company;

public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = null;
        employees[1] = new Employee(null, 2, 40_000);
        employees[2] = new Employee("Петров Вася", 2, 30_000);
        employees[3] = new Employee("Валиев Дима", 2, 10_000);
        printAllEmployee();
        System.out.println(getCalculateSumSalary());
        System.out.println(getEmployeeMinSalary());
        System.out.println(getEmployeeMaxSalary());
        System.out.println(getAverageSalaryEmployee());
        printNameAllEmployee();
    }

    public static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getCalculateSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double min = 0;
        int index = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }
        }

        Employee employeeMinSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeMinSalary = employees[i];
            }
        }
        return employeeMinSalary;
    }

    public static Employee getEmployeeMaxSalary() {
        double max = 0;
        int index = 0;
        Employee employeeMaxSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                employeeMaxSalary = employees[i];
                index = i;
                break;
            }
        }

        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                employeeMaxSalary = employees[i];
            }
        }
        return employeeMaxSalary;
    }

    public static double getAverageSalaryEmployee() {
        double sum = 0;
        int countEmp = 0;
        for (Employee emp : employees) {
            if (emp == null) continue;
            countEmp++;
            sum += emp.getSalary();
        }
        return sum / countEmp;
    }

    public static void printNameAllEmployee() {
        for (Employee empl : employees) {
            if (empl == null) continue;
            System.out.println(empl.getFullName());
        }
    }

}
