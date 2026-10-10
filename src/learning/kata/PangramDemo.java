package learning.kata;

// Reconstructed from Codewars 6 kyu: detect whether all 26 letters appear.
public class PangramDemo {
    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println(isPangram("Hello, World!"));
    }

    static boolean isPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String lower = sentence.toLowerCase();
        for (int i = 0; i < alphabet.length(); i++) {
            String letter = alphabet.substring(i, i + 1);
            if (!lower.contains(letter)) {
                return false; // One missing letter means it is not a pangram.
            }
        }
        return true;
    }
}
