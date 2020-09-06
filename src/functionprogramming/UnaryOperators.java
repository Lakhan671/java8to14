package functionprogramming;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperators {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator=(i)->i*i;
        System.out.println(unaryOperator.apply(10));
        IntUnaryOperator intUnaryOperator=(i)->i*i;
        System.out.println(intUnaryOperator.applyAsInt(10));
    }
}
