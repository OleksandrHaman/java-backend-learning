package learning.projects.restaurant;

public class Manager extends Employee {

    public Manager(String name, double hourlyRate) {
        super(name, hourlyRate);
    }
    @Override
    public void work(){
        System.out.println(getName() + " is managing the shift");
    }
}
