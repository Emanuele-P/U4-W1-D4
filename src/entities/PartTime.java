package entities;

import enums.DepartmentType;

public class PartTime extends Employee {
    //attributes
    private int workingHours;
    private double hourlySalary;

    //constructor
    public PartTime(int salary, DepartmentType department, int workingHours) {
        super(salary, department);
        this.workingHours = 20;
    }

    @Override
    public void calculateSalary() {
        double hourlySalary = 0;

        switch (getDepartment()) {
            case PRODUCTION:
                hourlySalary = 15;
                break;
            case ADMINISTRATION:
                hourlySalary = 20;
                break;
            case SALES:
                hourlySalary = 12;
                break;
            default:
                break;
        }

        double monthlySalary = (hourlySalary * workingHours) * 4;
        System.out.println("Monthly salary is: " + monthlySalary + "€");
    }

    //encapsulation

    public int getWorkingHours() {
        return workingHours;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }
}
