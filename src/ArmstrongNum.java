public class ArmstrongNum {
    public static void main(String args[]){
        int num=153;
        int t1 = num;
        int length= 0;
        while(t1 !=0)
        {
            length=length+1;
            t1=t1/10;
        }
        int t2=num,arm=0,rem=0;
                while(t2!=0){
                    int mul=1;
                    rem=t2%10;
                    for(int i=1;i<=length;i++)
                    {

                        mul=mul*rem;
                    }
                    arm= arm+mul;
                    t2=t2/10;
                }
                if(arm==num){
                    System.out.print("Number is Armstrong number");
                }
                else{
                    System.out.print("Number is not Armstrong number");
                }
    }
}
