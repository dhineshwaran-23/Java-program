import java.util.Scanner;

public class Discount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price: ");
        double op = sc.nextDouble();
        System.out.print("Enter the Discount percentage: ");
        double dp = sc.nextDouble();
        double discount = (op * dp) / 100;
        double ActualPrice = op - discount;
        System.out.println("Discount Amount: " + discount);
        System.out.println("After the discount the Price is: "+ ActualPrice);
    }
}
