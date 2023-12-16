import java.util.Scanner;
public class QUES4{
    public static void main(String[] args){
       
         Scanner sc = new Scanner(System.in);
       System.out.print("Enter the String : ");
        String str = sc.nextLine();

        int CountA = 0;
        int CountB = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                CountA++;
            } else if (ch == ')') {
                CountB++;
                if (CountB > CountA) {
                    break;
                }
            } else {
                continue;
            }
        }

        boolean balanced = CountA == CountB;

        if (balanced) {
            System.out.println("True...!'"+ str +"' has balanced parentheses.");
        } else {
            System.out.println("False...!'"+ str +"' has unbalanced parentheses.");
        }
    }
}