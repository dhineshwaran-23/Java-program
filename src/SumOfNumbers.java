import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
        }
        System.out.println("The sum is: " + sum);
    }
}
