package entities;

import enums.DepartmentType;

import java.util.Random;

public abstract class Employee {

    //attributes
    private int id;
    private int salary;
    private DepartmentType department;

    //constructor
    public Employee(int salary, DepartmentType department) {
        Random random = new Random();
        this.id = random.nextInt(0000, 9999);
        this.salary = 0;
        this.department = department;
    }

    //methods
    public void printEmployee() {
        System.out.println("Employee ID:" + this.id + ", department: " + this.department);
    }

    public abstract void calculateSalary();

    //encapsulation
    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public DepartmentType getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentType department) {
        this.department = department;
    }
}
