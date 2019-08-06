import java.util.Scanner;

public class FactorialNum{


    public static void main(String args[]){
        int fact=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=scanner.nextInt();
       for(int i=1;i<=num;i++)
       {
           fact = fact*i;
       }
       System.out.println("Factorial of number is :"+ fact);

    }
}