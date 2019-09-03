public class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 3; i++)
            System.out.println("Runnable Interface");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread2 t2=new Thread2();
        Thread obj=new Thread(t2);
        obj.start();
        obj.join();


        for(int i=1;i<3;i++){
            System .out.println("Main Thread");
        }

    }
}
