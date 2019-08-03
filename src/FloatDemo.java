import java.util.Scanner;

public class FloatDemo {
    public static void main(String args[]){
        float num1;
        float num2;
        float num3;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of num1 :");
        num1=scanner.nextFloat();
        System.out.print("Enter the value of num2:");
        num2=scanner.nextFloat();
        num3=num1+num2;
        System.out.print("num3");
        System.out.print("New value of num1 :"+num3);
    }
}
