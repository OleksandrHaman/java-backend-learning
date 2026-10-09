public class Main {
    public static void main(String[] args) {
    Employee[] employees = {
            new Employee(),
            new Manager(),
            new Cleaner(),
    };

    for (Employee employee : employees){
        employee.work();
    }

    }
}

class Employee{
    void work(){
        System.out.println("Preparing orders");
    }
}

class Manager extends Employee{
    @Override
    void work(){
        System.out.println("Managing the shift");
    }

}

class Cleaner extends Employee{
    @Override
    void work(){
        System.out.println("Cleaning restaurant");
    }
}