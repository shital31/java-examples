import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String name = " Shital";
       // Scanner scanner=new Scanner(System.in);
        //String name;
        //System.out.println("Enter the string : ");
        int length =  name.length();
        String rev = "";
        for(int i = length-1;i >=0 ; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse string :"+rev);

    }
}

