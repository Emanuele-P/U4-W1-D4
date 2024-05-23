import Interfaces.Worker;
import entities.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Employee[] partTimers = PartTime.partTimers();
        Employee[] fullTimers = FullTime.fullTimers();
        Employee[] managers = Manager.managers();

//        employee[0] = new Employee(DepartmentType.SALES);
//        employee[1] = new Employee(DepartmentType.PRODUCTION);
//        employee[2] = new Employee(DepartmentType.ADMINISTRATION);

        Volunteer volunteer1 = new Volunteer("Mario", 30, "That Mario.");
        Volunteer volunteer2 = new Volunteer("Bowser", 50, "I need a change of scenery!");
        Volunteer volunteer3 = new Volunteer("Toad", 20, "I don't know where I am!");
        Volunteer[] volunteers = new Volunteer[]{volunteer1, volunteer2, volunteer3};

        Worker[] allWorkers = new Worker[12];

        System.arraycopy(partTimers, 0, allWorkers, 0, partTimers.length);
        System.arraycopy(fullTimers, 0, allWorkers, 3, fullTimers.length);
        System.arraycopy(managers, 0, allWorkers, 6, managers.length);
        System.arraycopy(volunteers, 0, allWorkers, 9, volunteers.length);

        double totSalaries = 0;

        System.out.println("All Workers:");
        for (Worker worker : allWorkers) {
            if (worker instanceof Employee employee) {
                employee.printEmployee();
                double salary = employee.calculateSalary();
                System.out.println("Salary: " + salary);
                totSalaries += salary;
            }
        }
        System.out.println("Total salaries: " + totSalaries);

        for (Worker worker : allWorkers) {
            worker.checkIn(LocalDateTime.now());
        }
    }
}