package learning.kata;

// Reconstructed from Codewars 8 kyu: find the minimum, including negatives.
public class SmallestNumberDemo {
    public static void main(String[] args) {
        System.out.println(findSmallest(new int[] {34, -345, -1, 100}));
    }

    static int findSmallest(int[] numbers) {
        // This exercise assumes a non-empty array.
        int minimum = numbers[0]; // Zero would fail for all-positive arrays.
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }
}
