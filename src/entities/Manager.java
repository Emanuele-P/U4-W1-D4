package entities;

import enums.DepartmentType;

public class Manager extends Employee {
    //attributes
    private double baseSalary;

    //constructor
    public Manager(DepartmentType department) {
        super(0, department);
        this.baseSalary = 3000;
        salaryByDepartment(department);
    }

    //methods

    public static Manager[] managers() {
        return new Manager[]{
                new Manager(DepartmentType.PRODUCTION),
                new Manager(DepartmentType.ADMINISTRATION),
                new Manager(DepartmentType.SALES),
        };
    }

    public void salaryByDepartment(DepartmentType department) {
        switch (getDepartment()) {
            case PRODUCTION:
                this.baseSalary += 500;
                break;
            case ADMINISTRATION:
                this.baseSalary += 1000;
                break;
            case SALES:
                this.baseSalary += 800;
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
        return "Manager{" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
