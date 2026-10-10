package learning.oop;

// Reconstructed from our extends / super(name) exercise.
public class InheritanceDemo {
    public static void main(String[] args) {
        StaffMember worker = new ShiftManager("Alex");
        worker.work(); // Calls the overridden ShiftManager implementation.
    }
}

class StaffMember {
    protected String name;

    StaffMember(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is working");
    }
}

class ShiftManager extends StaffMember {
    ShiftManager(String name) {
        super(name); // Calls the parent constructor first.
    }

    @Override
    void work() {
        System.out.println(name + " is managing the shift");
    }
}
