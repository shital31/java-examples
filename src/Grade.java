import java.util.Scanner;

public class Grade {
    private void checkGrade (int average){
        if (average>=90){
            System.out.print("Your Grade is A : ");
        }
         else if (average>=70 && average<90){
            System.out.print("your grade is B :");
        }
         else if (average>=50 && average<70){
             System.out.print("Your grade is C :");
        }
         else if (average<50){
             System.out.print("Invalid number");
        }

    }
    public static void main(String args[]){
        int num1,num2,average;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the marks test 1 :");
        num1=scanner.nextInt();
        System.out.print("Enter the marks test 2 :");
         num2=scanner.nextInt();
         average=(num1+num2)/2;
        System.out.println("Result :"+average);
        Grade check=new Grade();
        check.checkGrade(average);

    }

}
