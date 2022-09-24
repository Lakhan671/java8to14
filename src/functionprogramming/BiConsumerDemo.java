package functionprogramming;

import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<String,Integer> data=(name,age)->{
            System.out.println(name+" age is "+age);
        };
        data.accept("Lakhan Singh",28);
        DoubleConsumer d=(de)->{
            System.out.println(de);
        };
        d.accept(4);
    }
}
