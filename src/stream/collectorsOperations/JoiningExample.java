package stream.collectorsOperations;

import functionprogramming.Instructor;
import functionprogramming.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {
      String str= Stream.of("E","l","p...").collect(Collectors.joining());
        System.out.println(str);
        String str2= Stream.of("E","l","p...","t").collect(Collectors.joining(","));
        System.out.println(str2);
        String st3=Stream.of("E","F","H").collect(Collectors.joining(",","{","}"));
        System.out.println(st3);
        String str4= Instructors.getAll().stream().map(Instructor::getName).
                collect(Collectors.joining(",","{","}"));
        System.out.println(str4);

    }

}
