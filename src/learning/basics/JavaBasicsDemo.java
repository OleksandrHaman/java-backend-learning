package learning.basics;

// Restored from commit ef86f198; adapted for a standalone lesson.
// Run this class's main() in IntelliJ IDEA.
import java.util.Scanner;
public class JavaBasicsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.println("My name is Alex");
        System.out.println("This is my first day with Java");
        int ageFirst = 21;
        System.out.println(ageFirst);
        int salary = 243;
        System.out.println(salary);
        String nameFirst = "Oleksandr";
        System.out.println(nameFirst);
        String city = "Wroclaw";
        System.out.println(city);
        String ageText = "21";
        int ageNumber = 21;
        System.out.println(ageText + 5);
        System.out.println(ageNumber + 5);
        System.out.println("My name is " + nameFirst);
        System.out.println("I live in " + city);
        System.out.println("I am " + ageFirst + " years old");
        double height = 27.5;
        boolean isStudent = true;
        char firstLetter = 'w';
        System.out.println(height);
        System.out.println(isStudent);
        System.out.println(firstLetter);
        int a = 21;
        int b = 12;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        int money = 200;
        if (money >= 300){
            System.out.println("Can buy");
        } else {
            System.out.println("Not enough money");
        }
        int score = 90;
        if (score >= 100){
            System.out.println("Excellent");
        } else if (score >= 75) {
            System.out.println("Good");
        } else{
            System.out.println("Need more practice");
        }
        System.out.println(5 == 0);
        System.out.println( 5 != 0);
        System.out.println( 5 > 0);
        System.out.println(5 < 0);
        boolean hasTicket = true;
        System.out.println(ageFirst >= 18 && hasTicket);
        System.out.println(ageFirst >= 18 || hasTicket);
        System.out.println(ageFirst < 18 && hasTicket);
        System.out.println(ageFirst < 18 || hasTicket);
        System.out.println(!hasTicket);
        boolean hasMembership = true;
        boolean hasTowel = false;
        boolean isTrainer = false;
        if (((ageFirst >= 18) && hasMembership) || isTrainer){
            System.out.println("Entry allowed");
        }else {
            System.out.println("Entry denied");
        }
        if (!hasTowel){
            System.out.println("Remember to bring a towel");
        }
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Hello " + name);
        System.out.println("You are " + age +  " years old");
        if (age >= 18){
            System.out.println("You are an adult");
        }else {
            System.out.println("You are a minor");
        }
    }
}
