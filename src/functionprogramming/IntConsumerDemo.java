package functionprogramming;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class IntConsumerDemo {
    public static void main(String[] args) {
        IntConsumer intConsumer=(a)-> System.out.println(a*10);
         intConsumer.accept(5);
        LongConsumer longConsumer=(a)-> System.out.println(a*10);
        longConsumer.accept(5);
        DoubleConsumer doubleConsumer=(x)-> System.out.println(x*10);
        doubleConsumer.accept(5);
    }
}
