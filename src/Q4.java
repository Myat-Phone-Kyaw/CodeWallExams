import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner frequencies = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int input = frequencies.nextInt();

        int output[] = new int[input];
        Scanner num = new Scanner(System.in);

        for (int i = 0; i < output.length; i++) {
            System.out.print("Enter a number: ");
            output[i] = num.nextInt();
        }
        System.out.println(Arrays.toString(output));
    }
}
