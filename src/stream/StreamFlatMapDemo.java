package stream;

import functionprogramming.Instructor;
import functionprogramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamFlatMapDemo {
    public static void main(String[] args) {
        Set<String> st= Instructors.getAll().stream().map(Instructor::getCourses)
                .flatMap(List::stream).sorted()
                .collect(Collectors.toSet());
        System.out.println(st);
    }

}
