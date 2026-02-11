import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("First no: ");
        int a = sc.nextInt();

        System.out.print("Second no: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Largest no is " + a);
        } else {
            System.out.println("Largest no is: " + b);
        }
    }
}
