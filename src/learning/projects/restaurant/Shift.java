package learning.projects.restaurant;

public class Shift {
    public Shift(String shiftName, Employee[] employees){
        this.shiftName = shiftName;
        this.employees = employees;
    }
   private String shiftName;
   private Employee[] employees;
   void startShift(){
       System.out.println("Starting " +  shiftName);
       for (Employee employee : employees){
           employee.work();
       }
    }

    public String getShiftName() {
        return shiftName;
    }
    public int getEmployeeCount(){
       return employees.length;
    }

    public double getTotalHourlyCost(){
       double total = 0;
       for (Employee employee : employees){
           total += employee.getHourlyRate();
       }
       return total;
    }

    public void printReport(){
        System.out.println("=== Shift Report ===");
        System.out.println("Shift: " + getShiftName());
        System.out.println("Employees: " + getEmployeeCount());
        System.out.println("Total hourly cost: " + getTotalHourlyCost() + " PLN");
    }
}
