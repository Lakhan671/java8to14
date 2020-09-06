package functionprogramming;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<String,Integer> data=(name,age)->{
            System.out.println(name+" age is "+age);
        };
        data.accept("Lakhan Singh",28);

    }
}
