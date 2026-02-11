import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if(op == '+') {
            System.out.println("Result = " + (a + b));
        }
        else if(op == '-') {
            System.out.println("Result = " + (a - b));
        }
        else if(op == '*') {
            System.out.println("Result = " + (a * b));
        }
        else if(op == '/') {
            if(b != 0) {
                System.out.println("Result = " + (a / b));
            } else {
                System.out.println("Division by zero is not allowed");
            }
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}
