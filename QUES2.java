import java.util.Scanner;
public class QUES2{
    public static void main(String[] args){
       
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to replace: ");
        char Replace = sc.nextLine().charAt(0);

        System.out.print("Enter the replacement character: ");
        char replacement = sc.nextLine().charAt(0);

        String replacedString = "";
        for (int i = 0; i < str.length(); i++) {
            char C_Char = str.charAt(i);
            replacedString += (C_Char == Replace) ? replacement : C_Char;
        }

        // Print results
        System.out.println("Original string: " + str);
        System.out.println("Replaced string: " + replacedString);

       
    }
}