import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total Amount sale: ");
        double ts = sc.nextDouble();
        System.out.print("Enter commission  percentage: ");
        double cp = sc.nextDouble();
        double commission  = (ts * cp) / 100;
        System.out.println("The commission price is: "+ commission);
    }
}

