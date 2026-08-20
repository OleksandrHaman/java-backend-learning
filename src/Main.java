import java.util.Enumeration;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] orders = new int[5];
        for (int i = 0; i < orders.length; i++){
            System.out.println("Enter order" + ( i + 1) + ": ");
            orders[i] = scanner.nextInt();
        }
        int choice = -1;
        while (choice != 0){
            System.out.println("1 - Show all orders");
            System.out.println("2 - Show total");
            System.out.println("3 - Show largest order");
            System.out.println("4 - Show smallest order");
            System.out.println("5 - Show average");
            System.out.println("6 - Count expensive orders");
            System.out.println("7 - Find order");
            System.out.println("0 - Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1 -> showOrder(orders);
                case 2 -> System.out.println("Total: " + calculateTotal(orders));
                case 3 -> System.out.println("Max: " + findMax(orders));
                case 4 -> System.out.println("Min: " + findMin(orders));
                case 5 -> System.out.println("Average: " + calculateAverage(orders));
                case 6 -> System.out.println("Expensive orders: " + countExpensive(orders));
                case 7 -> {
                    System.out.println("Enter sum: ");
                    int target = scanner.nextInt();
                    if (findOrder(orders, target)) {
                        System.out.println("Found");
                    } else {
                        System.out.println("Not found");
                    }
                }
            }
        }
    }

    public static void   showOrder (int[] orders){
        for (int i = 0; i < orders.length; i++){
            System.out.println(orders[i]);
        }
    }

    public static boolean findOrder(int[] orders, int target){
        boolean found = false;
        for (int order : orders){
            if (order == target){
                found = true;
            }
        }
        return  found;
    }

    public static int countExpensive(int[] orders){
        int count = 0;
        for (int i = 0; i < orders.length; i++){
            if (orders[i] >= 100){
                count++;
            }
        }
        return count;

    }

    public static double calculateAverage(int[] orders){
        double average = 0;
        double sum = 0;
        for (int i = 0; i < orders.length; i++) {
            sum += orders[i];
        }
        average = sum / orders.length;
        return average;
    }

    public static int calculateTotal(int[] orders){
        int sum = 0;
        for (int i = 0; i < orders.length; i++){
            sum += orders[i];
        }
        return sum;
    }

    public static int findMax(int[] orders){
        int max = orders[0];
        for (int i = 0; i < orders.length; i++){
            if (orders[i] > max){
                max = orders[i];
            }
        }
        return max;
    }

    public static int findMin(int[] orders){
        int min = orders[0];
        for (int i = 0; i < orders.length; i++){
            if (orders[i] < min) {
                min = orders[i];
            }
        }
        return min;

    }

}
