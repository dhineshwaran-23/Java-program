import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Original Value: ");
        double originalValue = sc.nextDouble();
        System.out.print("Enter the depreciation rate per Year: ");
        double depRate = sc.nextDouble();
        System.out.print("Enter the Number of Years: ");
        int year = sc.nextInt();
        double currentvalue = originalValue;
        for(int i=1 ; i <= year ; i++){
            double depreciation = (depRate * currentvalue)  / 100;
             currentvalue = currentvalue - depreciation;
        }
        System.out.println("The current value is: "+ currentvalue);
    }
}
