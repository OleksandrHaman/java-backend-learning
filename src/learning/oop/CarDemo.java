package learning.oop;

// Reconstructed from our OOP constructor lesson (not an archived commit).
public class CarDemo {
    public static void main(String[] args) {
        Car first = new Car("Mazda", "RX-8", 2005);
        Car second = new Car("BMW", "320i", 2008);
        first.showInfo();
        second.showInfo();
    }
}

class Car {
    private String brand;
    private String model;
    private int year;

    Car(String brand, String model, int year) {
        // this.brand is a field; brand is a constructor parameter.
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void showInfo() {
        System.out.println(brand + " " + model + " (" + year + ")");
    }
}
