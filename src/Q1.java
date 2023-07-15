import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner seconds = new Scanner(System.in);
        System.out.println("Enter the number of seconds >> ");
        int input = seconds.nextInt();

        System.out.println(input / 60);

    }
}
