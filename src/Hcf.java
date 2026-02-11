import java.util.Scanner;

public class Hcf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int hcf = 1;
        int min = Math.min(a,b);
        for( int i = 1; i <= min; i++ ){
            if(a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        System.out.println(hcf);
        int lcm = a * b / hcf;
        System.out.println(lcm);
    }
}
