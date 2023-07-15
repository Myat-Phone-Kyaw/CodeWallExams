import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int numbers[][] = new int[3][];
        numbers[0] = new int[5];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;
        numbers[0][4] = 5;

        numbers[1] = new int[5];
        numbers[1][0] = 5;
        numbers[1][1] = 4;
        numbers[1][2] = 3;
        numbers[1][3] = 2;
        numbers[1][4] = 1;

        numbers[2] = new int[7];
        numbers[2][0] = 7;
        numbers[2][1] = 8;
        numbers[2][2] = 9;
        numbers[2][3] = 1;
        numbers[2][4] = 5;
        numbers[2][5] = 7;
        numbers[2][6] = 7;

        int results[][] = new int[3][];
        results[0] = new int[5];
        results[0] = numbers[1];

        results[1] = new int[5];
        results[1] = numbers[0];

        results[2] = new int[7];
        results[2][0] = 7;
        results[2][1] = 7;
        results[2][2] = 5;
        results[2][3] = 1;
        results[2][4] = 9;
        results[2][5] = 8;
        results[2][6] = 7;

        for (int[] number : numbers) {
            System.out.println("Original :" +Arrays.toString(number));
        }

        System.out.println("");

        for (int[] result : results) {
            System.out.println("Result :" +Arrays.toString(result));
        }
    }
}
