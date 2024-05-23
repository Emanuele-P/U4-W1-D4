import entities.Employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[9];

//        employee[0] = new Employee(DepartmentType.SALES);
//        employee[1] = new Employee(DepartmentType.PRODUCTION);
//        employee[2] = new Employee(DepartmentType.ADMINISTRATION);

        for (int i = 0; i < employee.length; i++) {
            

        }

        for (int i = 0; i < employee.length; i++) {
            employee[i].printEmployee();
        }
    }
}