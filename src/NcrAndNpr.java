import java.util.Scanner;

public class NcrAndNpr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        System.out.print("Enter the value: ");
        int r = sc.nextInt();
        if( r > n ){
            System.out.println("The given value is incorrect!!!");
        }else {
            int nPr = 1;
            for(int i=0; i <= r-1; i++){
                nPr = nPr * (n - i);
            }
            int factR = 1;
            for (int i = 1; i <= r; i++){
                factR = factR * i;
            }
            int nCr = nPr / factR;
            System.out.println("The Permutation of the Number is: "+ nPr);
            System.out.println("The Combination of the Number is: "+ nCr);
        }
    }
}
