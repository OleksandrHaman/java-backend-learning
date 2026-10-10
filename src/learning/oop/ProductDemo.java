package learning.oop;

// Reconstructed from our private fields, getters and setters practice.
public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Coffee", 12.50);
        product.setPrice(-50); // Ignored: price must be positive.
        product.setPrice(13.00);
        System.out.println(product.getName() + ": " + product.getPrice());
    }
}

class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        setPrice(price); // Reuse validation instead of duplicating it.
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
}
