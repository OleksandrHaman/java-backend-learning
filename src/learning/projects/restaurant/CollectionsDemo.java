package learning.projects.restaurant;
import java.util.ArrayList;
import java.util.List;

 class CollectionsDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alex", 30.00));
        employees.add(new Manager("John", 40.00));
        employees.remove(0);
        employees.add(new Employee("Anna", 35.00));
        employees.add(new Employee("Oleh", 32.00));
        for (Employee employee : employees) {
            if (employee.getHourlyRate() >= 35.00) {
                System.out.println(employee.getName() + " - " + employee.getHourlyRate());
            }
        }
        double total = 0;
        int totalEmployee = 0;
        for (Employee employee : employees){
            if (employee.getHourlyRate() >= 35.00){
                total += employee.getHourlyRate();
                totalEmployee++;
            }
        }
        System.out.println(totalEmployee + " " + total);
    }
}