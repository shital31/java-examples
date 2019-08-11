public class ConstructorDemoEmployee {
    String name;
    int emp_id;
    ConstructorDemoEmployee (String name,int emp_id){
        this.name = name;
        this.emp_id = emp_id;

    }
    public static void main(String args[]){
        ConstructorDemoEmployee e1= new ConstructorDemoEmployee("Shital",1);
        ConstructorDemoEmployee e2 = new ConstructorDemoEmployee("Swapnil", 2);
        System.out.println("ConstructorDemoEmployee e1 :"+e1.name+" "+e1.emp_id);
        System.out.println("ConstructorDemoEmployee e2 :"+e2.name+" "+e2.emp_id);

    }


}
