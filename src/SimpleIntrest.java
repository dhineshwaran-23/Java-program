import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount:  ");
        int p = sc.nextInt();
        System.out.print("Enter the Rate of interest:  ");
        int r = sc.nextInt();
        System.out.print("Enter the Time:  ");
        int t = sc.nextInt();
        int SimpleInterest = p * r * t / 100;
        int TotalInterest = p + SimpleInterest;
        System.out.println(SimpleInterest);
        System.out.println(TotalInterest);
    }
}
