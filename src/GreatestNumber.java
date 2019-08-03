import java.util.Scanner;

public class GreatestNumber {
    private void checkGreatestNumber(int num1,int num2, int num3){
        if(num1>num2)
            if (num1>num3){
            System.out.print("Number one is Greater :");
        }
        if (num2>num1)
            if (num2>num3){
                System.out.print("Number two is Greater :");
            }
        if (num3>num1)
            if(num3>num2){
                System.out.print("Number three is Greater :");
            }
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Number :");
        int num1=scanner.nextInt();
        System.out.print("Enter Second Number :");
        int num2=scanner.nextInt();
        System.out.print("Enter Third Number :");
        int num3=scanner.nextInt();
        GreatestNumber check=new GreatestNumber();
        check.checkGreatestNumber(num1,num2,num3);
    }
}
