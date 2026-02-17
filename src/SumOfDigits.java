import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n = n / 10;
        }
        System.out.println("The sum is : " + sum);
        System.out.println("The Product is : " + product);
        System.out.println("The result is : " + (product - sum));
    }
}
