import java.util.Scanner;

// If your file is named String2.java, the class MUST be named String2
public class String2v{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String input = sc.next();

        char ch = input.charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("It is a Number");
        } 
        else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("It is a Character");
        } 
        else {
            System.out.println("It is a Special Character");
        }

        sc.close();
    }
}