package learning.kata;

// Reconstructed from Codewars 8 kyu: one flower must be even, the other odd.
public class OppositesAttractDemo {
    public static void main(String[] args) {
        System.out.println(isLove(1, 4));  // true
        System.out.println(isLove(2, 4));  // false
    }

    static boolean isLove(int flower1, int flower2) {
        boolean firstIsEven = flower1 % 2 == 0;
        boolean secondIsEven = flower2 % 2 == 0;
        // Different parity: one true and one false.
        return firstIsEven != secondIsEven;
    }
}
