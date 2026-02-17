import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Units Consumed: ");
        double units = sc.nextDouble();
        double bill = 0;
        double rate1 = 1.50;
        double rate2 = 2.50;
        double rate3 = 4.00;
        double rate4 = 6.00;
        int fixed_charge = 50;
        if(units <= 100){
             bill = units * rate1;
             System.out.println("The Amount is : " + bill);
        } else if (units <= 200) {
            bill = (100 * rate1) + ((units - 100) * rate2);
            System.out.println("The Amount is : " + bill);
        } else if (units <= 300) {
            bill = (100 * rate1) + (100 * rate2) +((units - 200) * rate3);
            System.out.println("The Amount is : " + bill);
        }else {
            bill = (100 * rate1) + (100 * rate2) + (100 * rate3) + ((units - 300 ) * rate4 );
            System.out.println("The Amount is : " + bill);
        }
        bill = bill + fixed_charge;
        System.out.println("The Total Bill Amount is : "+ bill);
    }
}
