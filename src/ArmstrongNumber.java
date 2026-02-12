import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Number = sc.nextInt();
        int original = Number;
        int temp = Number;
        int sum = 0;
        int digits = 0;
        while (temp != 0) {    // to count the no
            temp = temp / 10;
            digits++;
        }
        temp = Number;
        while (temp != 0) {   // main operation
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp = temp / 10;
            }
            if (sum == original) {
                System.out.println("The given Number is Armstrong Number: " + original);
            } else {
                System.out.println("The given Number is NOT Armstrong Number: " + original);
            }
        }
    }

