package abstractionpractice;

public class Tiger extends Animal implements AnimalMain{
    @Override
    void run() {
        System.out.println("Tiger is running");
    }

    public static void main(String[] args) {
        Animal an= new Tiger();
        an.run();
        Tiger t= new Tiger();
        t.sleep();

    }


    @Override
    public void sleep() {
        System.out.println("Tiger is sleeping");
    }
}
