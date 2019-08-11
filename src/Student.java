public class Student {
    String name;
    int roll_no;
    Student(String name , int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
    public static void main(String args[]){
        Student s1 = new Student("Shital", 01);
        Student s2 = new Student("Swapnil", 02);
        Student s3 = new Student("Shubhangi", 03);
        System.out.println("Student : "+s1.name+  " "+s1.roll_no);
        System.out.println("Student : "+s2.name+ " " + s2.roll_no);
        System.out.println("Student : "+s3.name+ " " + s3.roll_no);
    }

}
