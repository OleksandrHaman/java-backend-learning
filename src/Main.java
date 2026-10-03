import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] names = {
                "Alex",
                "John",
                "Kate",
                "Michael",
                "Anna",
                "Christopher",
                "Eva"
        };
        showAllNames(names);
        System.out.println("Long name: " + countLongNames(names));
        System.out.println("Longest name: " + findLongestName(names));
        System.out.println("Name starting with A: " + countNamesStartingWithA(names));
        System.out.println("Kate found: " + findName(names, "Kate"));
        System.out.println("David found: " + findName(names, "David"));
    }

    public static void showAllNames(String[] names){
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }

    public static int countLongNames(String[] names){
        int count = 0;
        for (int i = 0; i < names.length; i++){
            if (names[i].length() > 4){
                count++;
            }
        }
        return count;
    }

    public static String findLongestName(String[] names){
        String name = names[0];
        for (int i  = 0; i < names.length; i++){
            if (names[i].length() > name.length()){
                name = names[i];
            }
        }
        return name;
    }
    public static int countNamesStartingWithA(String[] names){
        int count = 0;
        for (int i = 0; i < names.length; i++){
            if (names[i].startsWith("A")){
                count++;
            }
        }
        return count;
    }

    public static boolean findName(String[] names, String target){
        for (int i = 0; i < names.length; i++){
            if (names[i].equals(target)) {
                return true;
            }
        }
        return false;
    }

}


