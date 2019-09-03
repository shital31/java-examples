package thread;



public class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i <5; i++) {
            System.out.println("Hello"+i );

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
            t1.start();
            t1.join();
        System.out.println("Hello");


    }


}
