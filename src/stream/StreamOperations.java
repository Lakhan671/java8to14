package stream;

import functionprogramming.Instructor;
import functionprogramming.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {
        long count= Instructors.getAll().stream()
                                                     .map(Instructor::getCourses)
                                                      .flatMap(List::stream)
                                                       .count();
        System.out.println(count);
      List<String> courcesList=  Instructors.getAll().stream().map(Instructor::getCourses).
              flatMap(List::stream).
              distinct().
              sorted().map(String::toLowerCase).
              collect(Collectors.toList());

        System.out.println(courcesList);
        boolean match= Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .allMatch(s->s.startsWith("J"));
        System.out.println(match);



    }
}
