package stream.generate;

import java.util.stream.Stream;

public class IterateDemo {
    public static void main(String[] args) {
        Stream<Integer>integerStream=Stream.iterate(0,i->i+2).limit(20);
          integerStream.forEach(System.out::println);
    }
}
