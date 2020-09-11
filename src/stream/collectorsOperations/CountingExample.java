package stream.collectorsOperations;

import functionprogramming.Instructor;
import functionprogramming.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingExample {
    public static void main(String[] args) {
        long count= Stream.of(1,2,3,4,5,6,7).collect(Collectors.counting());
        System.out.println(count);
        long count2= Instructors.getAll().stream().filter(Instructor::isOnlinesCourses).collect(Collectors.counting());
        System.out.println(count2);
    }
}
