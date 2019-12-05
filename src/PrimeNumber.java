import java.util.Scanner;

public class  PrimeNumber {
    public static void main(String args[]) {
        // int num ,i,j ;
        //Scanner scanner  = new Scanner(System.in);
        //System.out.print("Enter the value of number : ");
        // num = scanner.nextInt();
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    System.out.println(i);
                }
                if (i % j == 0) {
                    break;
                }
            }

        }
    }

}