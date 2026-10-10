package learning.oop;

// Restored from commit 3da2d4f1; adapted for a standalone lesson.
// Run this class's main() in IntelliJ IDEA.
public class PolymorphismDemo {
    public static void main(String[] args) {
    // One parent type can hold different concrete employee objects.
    Employee[] employees = {
            new Employee(),
            new Manager(),
            new Cleaner(),
    };

    for (Employee employee : employees){
        employee.work(); // The runtime object decides which override to call.
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
