package learning.projects.restaurant;

public class Employee {
private String name;
private double hourlyRate;
public Employee(String name, double hourlyRate){
    this.name = name;
    this.hourlyRate = hourlyRate;
}
public void work(){
    System.out.println(name + " is working");
}
public String getName(){
    return name;
}
public double getHourlyRate(){
    return hourlyRate;
}
}

