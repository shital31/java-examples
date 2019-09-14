import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       // sc.close();
        String revString = "";
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            revString = revString + ch[i];
            System.out.println(revString);
        }
        if(str.equals(revString)) {
            System.out.println(str + " is a palindrome");
        }
            else{
                System.out.println(str+"not palindrome");
            }
        }

    }

