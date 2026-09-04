import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[5];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter you gades" + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
        int choice = -1;
        while (choice != 0) {
            System.out.println("1 - Show all grades");
            System.out.println("2 - Show average");
            System.out.println("3 - Show highest grade");
            System.out.println("0 - Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showAll(grades);
                case 2 -> System.out.println("Average: " + calculateAverage(grades));
                case 3 -> System.out.println("highest grade: " + highestGrade(grades));
            }
        }
    }

    public static void showAll(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }

    public static double calculateAverage(int[] grades){
        double average = 0;
        double sum = 0;
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
            average = sum / grades.length;
        }
        return average;
    }

    public static int highestGrade(int[] grades){
        int max = grades[0];
        for (int i = 0; i < grades.length; i++){
            if (grades[i]  > max){
                max = grades[i];
            }
        }
        return max;
    }
}
