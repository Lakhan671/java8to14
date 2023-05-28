package stream.collectorsOperations;

import functionprogramming.Instructor;
import functionprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingExample {
    public static void main(String[] args) {
        long count= Stream.of(1,2,3,4,5,6,7).collect(Collectors.counting());
        System.out.println(count);
        long count2= Instructors.getAll().stream().filter(Instructor::isOnlinesCourses).collect(Collectors.counting());
        System.out.println(count2);
        Instructors.getAll().stream().collect(Collectors.groupingBy(Instructor::isOnlinesCourses,Collectors.mapping(Instructor::getName,Collectors.toList()))).
                forEach((a,b)->{
                    System.out.println(a+" "+b);
                } );
    }
}
