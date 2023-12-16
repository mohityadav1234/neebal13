import java.util.Scanner;
public class QUES3{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int i = 0;
        int j = str.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            while (!Character.isLetterOrDigit(str.charAt(i)) && i < j) {
                i++;
            }
            while (!Character.isLetterOrDigit(str.charAt(j)) && j > i) {
                j--;
            }
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("True....! '"+ str +"' is a palindrome!");
        } else {
            System.out.println("False....! '"+ str +"' is not a palindrome.");
        }
    }
}