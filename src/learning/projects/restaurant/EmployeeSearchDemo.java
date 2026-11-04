package learning.projects.restaurant;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSearchDemo {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager("John", 40.00));
        employees.add(new Employee("Oleh", 32.00));
        employees.add(new Employee("Anna", 35.00));
        employees.add(new Employee("Marta", 45.00));
        String searchName = "Alex";

        boolean found = false;

        for (Employee employee : employees){
            if (searchName.equals(employee.getName())){
                found = true;
                System.out.println(employee.getName() + " - " + employee.getHourlyRate());
            }
        }
        if (!found) {
            System.out.println("Employee not found");
        }
    }
}
