import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        int n = sc.nextInt();
        int sum = 0;
        double average = 0;
        for (int i = 1; i <= n; i++){
            System.out.print("Enter the Numbers: ");
            int num = sc.nextInt();
            sum = sum + num;
        }
        average = (double) sum / n;
        System.out.println("The Average of the Number is: " + average);
    }
}
