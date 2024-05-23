package entities;

import enums.DepartmentType;

public class FullTime extends Employee {

    //attributes
    private double baseSalary;

    //constructor
    public FullTime(DepartmentType department) {
        super(0, department);
        this.baseSalary = 1500;
        salaryByDepartment(department);
    }

    //methods

    public static FullTime[] fullTimers() {
        return new FullTime[]{
                new FullTime(DepartmentType.PRODUCTION),
                new FullTime(DepartmentType.ADMINISTRATION),
                new FullTime(DepartmentType.SALES),
        };
    }

    private void salaryByDepartment(DepartmentType department) {
        switch (getDepartment()) {
            case PRODUCTION:
                this.baseSalary = baseSalary + 300;
                break;
            case ADMINISTRATION:
                this.baseSalary = baseSalary + 800;
                break;
            case SALES:
                this.baseSalary = baseSalary + 500;
                break;
            default:
                break;
        }
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
