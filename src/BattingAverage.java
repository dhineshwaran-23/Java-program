import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total Run: ");
        int run = sc.nextInt();
        System.out.print("Enter the Number of Players out: ");
        int out = sc.nextInt();
        if(out == 0 ){
            System.out.println("The batting Average is cannot divisible !!!");
        }else{
            double battingAverage = run / out;
            System.out.println("The batting Average is: "+ battingAverage);
        }
    }
}
