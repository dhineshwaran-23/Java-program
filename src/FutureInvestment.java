import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Investment Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Annual Interest Rate: ");
        double Rate = sc.nextDouble();
        System.out.print("Enter the Number of years : ");
        double Time = sc.nextDouble();
        Rate = Rate / 100;
        double Final_Value = principal * Math.pow((1 + Rate), Time);
        System.out.println("Future Investment Value: "+ Final_Value);
    }
}
