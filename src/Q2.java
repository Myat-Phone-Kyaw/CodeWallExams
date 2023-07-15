import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner integers = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int first = integers.nextInt();

        System.out.print("Enter second integer: ");
        int second = integers.nextInt();

        System.out.print("Enter third integer: ");
        int third = integers.nextInt();

        int largest;
        int smallest;

        if ((first > second && first > third)||(first < second && first < third)){
            largest=first;
            smallest=first;
            System.out.println("Largest number is " +third);
        }else if(second > first && second > third){
            largest= second;
        }else if(third > first && third > second){
            System.out.println("Largest number is " +third);
        }else if(first < second){
            System.out.println("Smallest number is "+first);
        }else if(second < first){
            System.out.println("Smallest number is "+second);
        }else if(third < first) {
            System.out.println("Smallest number is "+third);
        }
    }
}
