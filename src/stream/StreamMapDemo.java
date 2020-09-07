package stream;

import functionprogramming.Instructor;
import functionprogramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapDemo {
    public static void main(String[] args) {
        Set<String> set= Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.toSet());
        System.out.println(set);
        List<String> list= Instructors.getAll().stream().map(Instructor::getName).map(String::toLowerCase).sorted().collect(Collectors.toList());
        System.out.println(list);
    }
}
