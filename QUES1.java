import java.util.Scanner;

public class QUES1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder ComString = new StringBuilder();
        char P_Char = str.charAt(0);
        int count = 1;

    for (int i = 1; i < str.length(); i++) {
        char C_Char = str.charAt(i);

        if (C_Char == P_Char) {
            count++;
        } else {
            ComString.append(P_Char);
        if (count > 1) {
            ComString.append(count);
            }

            P_Char = C_Char;
            count = 1;

           }

        }
        
        ComString.append(P_Char);
        if (count > 1) {
            ComString.append(count);

        }

        System.out.println("Original string: " + str);
        System.out.println("Compressed string: " + ComString);
    }
}