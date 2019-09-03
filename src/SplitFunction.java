import java.util.Arrays;
import java.util.List;

public class SplitFunction {
    public static void main(String[] args) {
        String str ="shital,aniket,rajan,priyanka,codekul";
        List<String> list = Arrays.asList(str.split(","));
        for (String s:list) {
            System.out.println(s);
        }
    }
}
