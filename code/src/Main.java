import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "mango" -> System.out.println("King of Fruits");
            case "Apple", "Orange", "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Not valid input");
        }
    }
}