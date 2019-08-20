package aggregation;

import org.jetbrains.annotations.Contract;

public class Student {
    int RollNo;
    String name;
   static Address add;
    public Student(int RollNo, String name, Address add){
        this.RollNo = RollNo;
        this.name = name;
        this.add = add;

    }

    void displayData(){
        System.out.println("RollNo : "+RollNo+" \n " + "name : "+ name+ " \n "+" RoomNo: "+add.RoomNo+"\n " +
                " city : " + add.city +"\n " + "state :" + add.state +"\n" + " country :" +add.country);
    }
    public static void main(String args[]){
        Address add = new Address(14,"Pune","Maharashtra","India");
        Student student = new Student(01,"Dinesh", add);

        student.displayData();
    }
}
