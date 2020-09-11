package stream.generate;

import java.util.Random;
import java.util.stream.Stream;

public class GenerateDemo {
    public static void main(String[] args) {
        Stream<Integer>integerStream=Stream.generate(new Random()::nextInt).limit(5);
        integerStream.forEach(System.out::println);
    }
}
