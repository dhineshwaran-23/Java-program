import java.util.Scanner;

public class SumOfLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n > max) {
                max = n;
            }
        }
        System.out.println("The Max is : " + max);
    }
}


