package lambda;

import java.util.List;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable=()->{
           int sum=0;
           for(int a : List.of(1,2,3,4)){
               sum+=a;
           }
            System.err.println(sum);
        };
        new Thread(runnable).start();
        new Thread(()->{
            int sum=0;
            for(int a : List.of(1,2,3,4,10)){
                sum+=a;
            }
            System.err.println(sum);
        }).start();
    }
}
