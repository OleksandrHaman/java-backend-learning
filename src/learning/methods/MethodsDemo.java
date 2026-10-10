package learning.methods;

// Restored from commit 665ccf6b; adapted for a standalone lesson.
// Run this class's main() in IntelliJ IDEA.
import java.util.Scanner;
public class MethodsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        printUserInfo(name,age);
        printWelcome();
        printGoodbye();
        int result = calculateSquare(5);
        System.out.println(result);
        int number = 10;
        if (isEven(number)){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        System.out.println(getGrade(80));
        double price =  49.99;
        int quantity = 3;
        boolean hasDiscount = true;
        double total = calculateTotal(price,quantity);
        double finalPrice = discount(hasDiscount,total);
        System.out.println("Price " + finalPrice);
        if (isExpensive(finalPrice)){
            System.out.println("Expensive order");
        }else {
            System.out.println("Normal price");
        }
    }


    public static double calculateTotal(double price, int quantity){
        return price * quantity;
    }
    public static double discount( boolean hasDiscount, double total){
        if (hasDiscount){
            return total * 0.9;
        } else {
            return total;
        }
    }

    public static boolean isExpensive(double total){
            return total >= 100;
    }

    public static String getGrade(int score){
        if (score >= 90){
            return "Excellent";
        }else if (score >= 75){
            return "Good";
        }else if (score >= 60){
            return "Pass";
        }else {
            return "Fail";
        }
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static  int calculateSquare (int number){
        return number * number;
    }

    public static void printUserInfo(String name, int age){
        System.out.println(name + " (" + age + ")");
        if (age >= 18){
            System.out.println("Adult");
        }else {
            System.out.println("Minor");
        }
    }

    public static void printWelcome(){
        System.out.println("Welcome to Java!");
    }
    public static void printGoodbye(){
        System.out.println("Goodbye!");
    }



}
