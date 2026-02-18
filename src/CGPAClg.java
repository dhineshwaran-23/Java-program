import java.util.Scanner;

public class CGPAClg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Subjects: ");
        int n = sc.nextInt();
        double totalCreditPoints = 0;
        double totalCredit = 0;
        for(int i = 1;i <= n; i++){
            System.out.print("Enter Grade Point: ");
            double gradePoint = sc.nextInt();
            System.out.print("Enter Credit: ");
            int credit = sc.nextInt();
            totalCreditPoints = totalCreditPoints + (gradePoint * credit);
            totalCredit = totalCredit + credit;
        }
        double CGPA = totalCreditPoints / totalCredit;
        System.out.println("CGPA = " + CGPA);
    }
}
