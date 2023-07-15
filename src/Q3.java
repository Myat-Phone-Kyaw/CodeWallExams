import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int x = num.nextInt();

        System.out.print("Enter second integer: ");
        int y = num.nextInt();

        System.out.println("Enter an operator +, -, *, / ");
        String operator = num.nextLine();

        System.out.println("Sum : " + (x + y));
        System.out.println("Multiply: " + (x * y));
        System.out.println("Division: " + (x / y));
    }
}
