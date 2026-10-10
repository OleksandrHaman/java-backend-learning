package learning.strings;

// Reconstructed from String exercises: equals, length, contains, startsWith,
// toLowerCase, substring, charAt and replace.
public class StringMethodsDemo {
    public static void main(String[] args) {
        String name = "Alex";
        String text = "Java Backend";
        System.out.println(name.length());
        System.out.println(name.startsWith("A"));
        System.out.println(name.equals("Alex")); // Compare text with equals(), not ==.
        System.out.println(text.toLowerCase().contains("backend"));
        System.out.println(text.substring(0, 4)); // End index is exclusive.
        System.out.println(text.charAt(0)); // Returns a char, not a String.
        System.out.println("GATTACA".replace('T', 'U'));
        // Strings are immutable: replace() returns a new String.
    }
}
