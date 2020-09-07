package stream;

import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9);
        int i=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(i);
        int ii=numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println(ii);
        Optional<Integer> iii=numbers.stream().reduce((a, b)->a+b);
        System.out.println(iii.get());
    }
}
