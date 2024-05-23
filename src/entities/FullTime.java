package entities;

import enums.DepartmentType;

public class FullTime extends Employee {

    //attributes
    private double baseSalary;

    //constructor
    public FullTime(int salary, DepartmentType department, double baseSalary) {
        super(salary, department);
        this.baseSalary = 1500;
    }

    @Override
    public void calculateSalary() {
        double monthlySalary = baseSalary;

        switch (getDepartment()) {
            case PRODUCTION:
                monthlySalary = baseSalary + 300;
                break;
            case ADMINISTRATION:
                monthlySalary = baseSalary + 800;
                break;
            case SALES:
                monthlySalary = baseSalary + 500;
                break;
            default:
                break;
        }

        System.out.println("Monthly salary is: " + monthlySalary + "€");
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
