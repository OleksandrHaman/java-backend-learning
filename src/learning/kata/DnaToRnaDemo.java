package learning.kata;

// Reconstructed from Codewars 8 kyu: DNA to RNA string transformation.
public class DnaToRnaDemo {
    public static void main(String[] args) {
        System.out.println(dnaToRna("GATTACA"));
    }

    static String dnaToRna(String dna) {
        // String.replace() creates a new String; the original remains unchanged.
        return dna.replace('T', 'U');
    }
}
