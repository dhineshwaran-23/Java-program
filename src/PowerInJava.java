import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.print("Enter the power value: ");
        int pow = sc.nextInt();
        int result = 1;
        for (int i = 1 ; i<=pow ; i++){
            result = result * n;
        }
        System.out.println("The value is : "+ result);
    }
}
