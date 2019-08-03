import java.util.Scanner;

public class LeapYear {
    private void checkLeapYear(int num){
        if(num % 400 == 0) {
            System.out.println("Year " + num + "is  leap year :");
        }
       else if(num%4==0){
            System.out.println("Year "+num +"is  leap year :");
        }
        else{
            System.out .println("Year "+num+ " is not leap year :");
            }

    }
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the year num :");
        int num=scanner.nextInt();
        LeapYear demo=new LeapYear();
        demo.checkLeapYear(num);
    }
}
