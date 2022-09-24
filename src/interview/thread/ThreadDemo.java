package interview.thread;

public class ThreadDemo  extends  Thread{
    public void start(){
        super.start();
    }
    public void run(){
        while(true) {
            System.out.println("running");
        }
    }

    public static void main(String[] args) {
        new ThreadDemo().start();
    }
}
