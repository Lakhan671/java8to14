package stream;

import functionprogramming.Instructor;
import functionprogramming.Instructors;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class StreamDemo {
    public static void main(String[] args) {
        Predicate<Instructor>p1=i->i.isOnlinesCourses();
        Predicate<Instructor>p2=i->i.getYearsOfExperience()>10;
        List<String> st= Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.toList());
        System.out.println(st);
        Map<String,List<String>>map=Instructors.getAll().stream().filter(p1.and(p2)).collect(Collectors.toMap(Instructor::getName,Instructor::getCourses));
        System.out.println(map);
    }
}
