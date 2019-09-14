import java.util.ArrayList;
import java.util.List;

public class StringList {
    public static void main(String[] args) {

        ArrayList<String>list1=new ArrayList<String>();
        list1.add("Shital");
        list1.add("Swapnil");
        list1.add("Shubhangi");
        list1.add("Shubham");
        ArrayList list2=new ArrayList();
        list2.add("Aniket");
        list2.add(72194688);
        list2.addAll(list1);
        System.out.println(list1);
        System.out.println(list2);

    }
}
