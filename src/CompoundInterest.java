import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter the Rate of Interset in % : ");
        double r = sc.nextDouble();
        System.out.print("Enter years: ");
        int y = sc.nextInt();
        double rate = r / 100;
        double amount = p;
        for(int i=1;i <= y; i++){
            double interest = amount * rate;
            amount = amount + interest;
        }
        double CI = amount - p;
        System.out.printf("The Compound Interest is: %.2f", CI);
    }
}
