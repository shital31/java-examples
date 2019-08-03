import java.util.Scanner;

public class IfElseDemo {
    private void checkIfElse(int num){
        if(num%2==0){
            System.out.print("Number is Even :");
        }
        else {
            System.out.print("Number is odd");
        }
    }

    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of number :");
        int num=scanner.nextInt();
        IfElseDemo demo=new IfElseDemo();
        demo.checkIfElse(num);
    }
}
