import java.util.Scanner;

public class ReverseStringRecursion {
    public static String reverseString(String string){
        if(string.isEmpty()){
            return string;
        }
        return reverseString(string.substring(1))+(string.charAt(0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out .print("Enter the String : ");
        String str=reverseString(sc.nextLine());
        System.out.println(str);
    }
}
