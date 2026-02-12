import java.util.Scanner;

public class RsToUsd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in Rs: ");
        float Rs = sc.nextFloat();
        double Rate = 0.011;
        double USD = Rs * Rate;
        System.out.println("The USD Amount is: " + "$ "+ USD);
    }
}
