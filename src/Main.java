import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day number");
        int dayNumber = scanner.nextInt();
        String dayName = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sanday";
            default -> "invalid day";
        };
        System.out.println(dayName);


        int countdown = 10;
        while (countdown >= 1) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("GO!");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        for (int i = 20; i >= 0; i -= 3) {
            System.out.println(i);
        }
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        for (int i = 1; i <= 20; i++) {
            if (i == 13) {
                break;
            }
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++){
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }

    }
    }
