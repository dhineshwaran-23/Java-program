import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter the x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter the y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter the y2: ");
        int y2 = sc.nextInt();
        int d1 = (x2 - x1);
        int d2 = (y2 - y1);
        double distance = Math.sqrt((d1 * d1 ) + (d2 * d2));
        System.out.println("The Between the two Coordinates: "+ distance);
    }
}
