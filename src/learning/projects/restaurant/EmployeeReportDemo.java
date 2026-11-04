package learning.projects.restaurant;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReportDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager("John", 40.00));
        employees.add(new Employee("Oleh", 32.00));
        employees.add(new Employee("Anna", 35.00));
        employees.add(new Employee("Marta", 45.00));

        int totalEmployee = 0;


        for (Employee employee : employees){
            if (employee.getHourlyRate() > 35.00){
                totalEmployee++;
                System.out.println(employee.getName());
            }
        }
        System.out.println( "Total employees: " +totalEmployee);
    }
}
