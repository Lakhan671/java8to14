package functionprogramming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c=(x)-> System.out.println(x.length()+" the value of x: "+x);
        c.accept("My name is Lakhan Singh");
        //block statement
        Consumer<Integer>x=(p)->{
            System.out.println("X*X:"+p*p);
        };
        x.accept(4);
    }
}
