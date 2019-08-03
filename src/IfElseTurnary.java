
import java.util.Scanner;

public class IfElseTurnary {
    public static void main(String args[]) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for number 1:-");
        num1 = scanner.nextInt();
        System.out.print("Enter the value for number 2:-");
        num2 = scanner.nextInt();
        System.out.print("Enter the value for number 3:-");
        num3 = scanner.nextInt();
        String x = "result";
        //String y = "result";
        //String z = "result";

        x = (num1 > num2 && num1 > num3) ?  "Number 1 is greater" : "Number 1 is not greater";
        System.out.println ("Greater Number is : " + x);
    }

    }


