package exceptionhandling;

import java.sql.SQLOutput;

public class ExceptionDemo {
    private void checkArithExc(){
        try{
            int num= 20;
            int result = num/0;
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ExceptionDemo obj=new ExceptionDemo();
        obj.checkArithExc();
    }
}
