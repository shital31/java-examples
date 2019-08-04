import java.util.Scanner;

public class VowelConsonantChar {
    private void checkVowelConsonantChar(char ch){
        if(ch == 'a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
        {
            System.out.println("Character is Vowel ");
        }
        else {
            System.out.println("Character is Consonant");
        }
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the character :");
        char in =scanner.next().charAt(0);
        VowelConsonantChar check=new VowelConsonantChar();
        check.checkVowelConsonantChar(in);

    }
}

