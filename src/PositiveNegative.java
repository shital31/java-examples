import java.util.Scanner;

public class PositiveNegative {
    private void checkPositiveNegative(int num){
        if(num>=0){
            System.out.print("Number is Positive :");
        }
        else{
            System.out.print("Number is Negative :");
        }
    }
    public static void main(String args []){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of Number :");
        int num=scanner.nextInt();
        PositiveNegative check=new PositiveNegative();
        check.checkPositiveNegative(num);

    }
}
