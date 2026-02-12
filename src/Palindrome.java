import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
            }
            left++;
            right--;
        }
        if(isPalindrome){
                System.out.println("The given String is Palindrome: " + str);
            }else{
            System.out.println("The given String is not Palindrome: " + str);
        }
    }
}
