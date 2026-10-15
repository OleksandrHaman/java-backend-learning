package learning.oop.interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Workable[] workers = {
                manager,
                new Cook()
        };
        for (Workable workable : workers){
            workable.work();
        }
        manager.makeReport();
    }
}
interface Reportable{
    void makeReport();
}

interface Workable {
    void work();
}

class Manager implements Workable, Reportable{
    @Override
    public void work(){
        System.out.println("Managing the shift");
    }
    public void makeReport(){
        System.out.println("Generating shift report");
    }
}

class Cook implements Workable{
    @Override
    public void work(){
        System.out.println("Preparing food");
    }
}