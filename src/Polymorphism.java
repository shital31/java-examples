public class Polymorphism {
    void show(int a,String x){
        System.out.println("Method 1");
    }
    void show(String x,int a){
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        Polymorphism p=new Polymorphism();
        //p.show();
        p.show("abc", 12);
    }
}
