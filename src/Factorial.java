import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int fact = 1;
        if( n < 0){
            System.out.println("Please enter the Positive Number!!");
        }else {
            for(int i = 1; i <= n; i++){
                fact = fact * i ;
            }
            System.out.println("The Factorial of the Number is: "+ fact );
        }
    }
}
