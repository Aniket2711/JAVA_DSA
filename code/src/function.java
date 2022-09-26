import java.util.Scanner;

public class function {
    public static void main(String []args){
        sum();
    }
    static void sum()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum of two numbers"+c);
    }
}
