package learning.projects.restaurant;

public class RestaurantDemo {
    public static void main(String[] args){
        Employee employee = new Employee("Alex", 30.00);
        Manager manager = new Manager("John", 40.00);
        Employee[] employee1= {
                employee,
                manager
        };
        Shift shift = new Shift("Morning", employee1);
        shift.startShift();
        shift.printReport();
    }
}
