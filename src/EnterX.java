import java.util.Scanner;

public class EnterX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter the numbers: ");
            String m = sc.nextLine();
            if(m.equals("x")){
                break;
            }else{
                int n = Integer.parseInt(m);
                sum = sum + n;
            }
        }
        System.out.println(sum);
    }
}
