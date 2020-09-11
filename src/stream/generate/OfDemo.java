package stream.generate;

import java.util.Optional;
import java.util.stream.Stream;

public class OfDemo {
    public static void main(String[] args) {
        Stream<Integer> integerStream=Stream.of(1,2,3,4,5,6);
        long result=integerStream.count();
        System.out.println(result);
        Stream<Integer>integerStream1=Stream.of(new Integer[]{1,2,3,4,5,6,7});
        int ss =integerStream1.reduce(0,(a, b)->a+b);
        System.out.println(ss);
    }
}
