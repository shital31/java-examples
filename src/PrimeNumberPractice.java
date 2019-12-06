public class PrimeNumberPractice {
    public static void main(String[] args) {
        int num=7;
        for(int i=1; i<=num-1; i++){
            if(num%i == 0){
                System.out.println("not prime number");
            }
            else {
                System.out.println("prime number");
            }
        }
    }
}
