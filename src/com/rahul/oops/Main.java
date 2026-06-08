package com.rahul.oops;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 emp names
        String[] emps = {"Mark", "Peter", "Lewis", "Oscar", "Max"};

        // store 5 emp ids
        int[] empIds = {18, 81, 71, 37, 90};

        // store 5 emp details: [name, empid, age, department]
        Employee[] employees = new Employee[5];
        System.out.println(Arrays.toString(employees));

        Employee employee1 = new Employee(1001, "Oscar Piastri", 23, "F1 Driver");
        Employee employee2 = new Employee(1002, "Lewis Hamilton", 41, "F1 Driver");

        employee1.empInfo();
        employee2.empInfo();
//        employee1.empId = 1001;
//        employee1.name = "Oscar Piastri";
//        employee1.age = 23;
//        employee1.department = "Driver";

//        System.out.println(employee1.name);
//        System.out.println(employee1.empId);
//        System.out.println(employee1.age);
//        System.out.println(employee1.department);

//        employee2.empId = 1002;
//        employee2.name = "Lewis Hamilton";
//        employee2.age = 41;
//        employee2.department = "Driver";

//        System.out.println(employee2.name);
//        System.out.println(employee2.empId);
//        System.out.println(employee2.age);
//        System.out.println(employee2.department);
    }
}

class Employee {
    int empId;
    String name;
    int age;
    String department;

    Employee (int empId, String name, int age, String department) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    Employee () {

    }

    void empInfo() {
        System.out.println(this.empId);
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.department);
    }
}