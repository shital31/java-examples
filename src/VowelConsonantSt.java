public class VowelConsonantSt {
    public static void main(String args[]){
        String str= "Vowel Consonant in String ";
        int cnt = 0;
        char [] inp = str.toCharArray();
        System.out.print("Duplicate char in string are :" );
        for(int i=0; i<str.length(); i++){
            for(int j= i+1; j<str.length(); j++){
                if(inp[i]==inp[j]){
                    System.out.println(inp[j]);
                    cnt++;
                    break;
                }
            }

        }
    }
}
