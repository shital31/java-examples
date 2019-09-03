import java.util.Scanner;

public class ReverseStringSamePosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String reversestring = "";
        for (int i=0;i<words.length;i++){
            String word=words[i];
            String reverseWord="";
            for (int j=word.length()-1;j>=0;j--){
                reverseWord=reverseWord+word.charAt(j);
            }
            reversestring=reversestring+reverseWord+" ";
        }
        System.out.println("Reversed String : "+reversestring);
    }
}