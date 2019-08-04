import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]) {
        int num, x, r=0, rev=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = scanner.nextInt();
        x = num ;
        while (x > 0) {
            r = x % 10;
            rev = (rev * 10) + r;
            //System.out.println("Value of reverse :"+rev);
            x = x / 10;
            if (num == rev)
            {
                System.out.println("Number is Palindrome number");
            } else {
                System.out.println("Number is not palindrome number");
            }
        }
    }
}


