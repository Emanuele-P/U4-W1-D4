package entities;

import enums.DepartmentType;

public class PartTime extends Employee {
    //attributes
    private int workingHours;
    private double hourlySalary;

    //constructor
    public PartTime(DepartmentType department) {
        super(0, department);
        this.workingHours = 20;
        salaryByDepartment(department);
    }

    //methods

    public static PartTime[] partTimers() {
        return new PartTime[]{
                new PartTime(DepartmentType.PRODUCTION),
                new PartTime(DepartmentType.ADMINISTRATION),
                new PartTime(DepartmentType.SALES),
        };
    }

    private void salaryByDepartment(DepartmentType department) {
        switch (department) {
            case PRODUCTION:
                this.hourlySalary = 13;
                break;
            case ADMINISTRATION:
                this.hourlySalary = 15;
                break;
            case SALES:
                this.hourlySalary = 10;
                break;
            default:
                this.hourlySalary = 0;
                break;
        }
    }

    @Override
    public double calculateSalary() {
        return (hourlySalary * workingHours) * 4;
    }

    //encapsulation

    public int getWorkingHours() {
        return workingHours;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "workingHours=" + workingHours +
                ", hourlySalary=" + hourlySalary +
                '}';
    }
}
