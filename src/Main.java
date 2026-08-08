import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привіт, Світ!");
        System.out.println("Мне звати Олександр");
        System.out.println("Це перший день в Java");
        int ageFirst = 21;
        System.out.println(ageFirst);
        int salary = 243;
        System.out.println(salary);
        String nameFirst = "Oleksandr";
        System.out.println(nameFirst);
        String city = "Wroclaw";
        System.out.println(city);
        String ageText = "21";
        int ageNumber = 21;
        System.out.println(ageText + 5);
        System.out.println(ageNumber + 5);
        System.out.println("Мене звати " + nameFirst);
        System.out.println("Я живу в " + city);
        System.out.println("Мені " + ageFirst + " років");
        double height = 27.5;
        boolean isStudent = true;
        char firstLetter = 'w';
        System.out.println(height);
        System.out.println(isStudent);
        System.out.println(firstLetter);
        int a = 21;
        int b = 12;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        int money = 200;
        if (money >= 300){
            System.out.println("Можу купити");
        } else {
            System.out.println("Не вистачає коштів");
        }
        int score = 90;
        if (score >= 100){
            System.out.println("Дуже добре");
        } else if (score >= 75) {
            System.out.println("Добре");
        } else{
            System.out.println("Потрібно більше практики");
        }
        System.out.println(5 == 0);
        System.out.println( 5 != 0);
        System.out.println( 5 > 0);
        System.out.println(5 < 0);
        boolean hasTicket = true;
        System.out.println(ageFirst >= 18 && hasTicket);
        System.out.println(ageFirst >= 18 || hasTicket);
        System.out.println(ageFirst < 18 && hasTicket);
        System.out.println(ageFirst < 18 || hasTicket);
        System.out.println(!hasTicket);
        boolean hasMembership = true;
        boolean hasTowel = false;
        boolean isTrainer = false;
        if ((ageFirst >= 18) && hasMembership || isTrainer){
            System.out.println("Вхід дозволено");
        }else {
            System.out.println("Вхід заборонено");
        }
        if (!hasTowel){
            System.out.println("Не забудьте взяти рушник");
        }
        System.out.println("Як тебе звати?");
        String name = scanner.nextLine();
        System.out.println("Скільки тобі років?");
        int age = scanner.nextInt();
        System.out.println("Привіт " + name);
        System.out.println("Тобі " + age +  " років");
        if (age >= 18){
            System.out.println("Ти повнолітній");
        }else {
            System.out.println("Ти неповнолітній");
        }
    }
}