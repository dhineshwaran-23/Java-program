import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int negative_Sum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;
        while (true){
            System.out.print("Enter the Number: ");
            int Number = sc.nextInt();
            if(Number == 0){
                System.out.println("Please enter the Valid Number!! ");
                break;
            } else if (Number < 0) {
                negative_Sum = negative_Sum + Number;
            } else if (Number > 0 && Number % 2 == 0) {
                positiveEvenSum = positiveEvenSum + Number;
            } else if (Number > 0 && Number % 2 != 0) {
                positiveOddSum = positiveOddSum + Number;
            }
        }
        System.out.println("Sum of Negative Numbers: "+ negative_Sum);
        System.out.println("Sum of Positive Even Numbers: "+ positiveEvenSum);
        System.out.println("Sum of Positive Odd Numbers: "+ positiveOddSum);
    }
}
