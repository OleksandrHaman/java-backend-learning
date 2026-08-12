import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 10, 13, 16};
        System.out.println(numbers[0] + ", " + numbers[2] + ", " + numbers[4]);
        System.out.println(numbers.length);
        double sum = 0;
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
            System.out.println(max);
        }
        int count = 0;
        System.out.println(count);
        for (int number : numbers){
            if (number % 2 == 0){
                sum += number;
            }

        }
        System.out.println(sum);
        int target = 13;
        boolean found = false;
        for (int number : numbers){
            if (number == target){
                found = true;
                break;
            }

        }
        if (found){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }
        int index = -1;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == target){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
