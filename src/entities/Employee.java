package entities;

import Interfaces.Worker;
import enums.DepartmentType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public abstract class Employee implements Worker {

    //attributes
    private final int id;
    private final double salary;
    private DepartmentType department;

    //constructor
    public Employee(double salary, DepartmentType department) {
        Random random = new Random();
        this.id = random.nextInt(1000, 9999);
        this.salary = 0;
        this.department = department;
    }

    //methods
    public void printEmployee() {
        System.out.println("Employee ID:" + this.id + ", department: " + this.department);
    }

    public abstract double calculateSalary();

    //encapsulation
    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public DepartmentType getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentType department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    @Override
    public void checkIn(LocalDateTime time) {
        System.out.println("I am a " + this.getClass().getSimpleName());
        System.out.println("I checked in at " + time.format(DateTimeFormatter.ISO_TIME));
    }
}
