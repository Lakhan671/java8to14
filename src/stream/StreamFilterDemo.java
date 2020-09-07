package stream;

import functionprogramming.Instructor;
import functionprogramming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {
    public static void main(String[] args) {
        List<Instructor>instructors= Instructors.getAll().stream()
                .filter(i->i.getYearsOfExperience()>10)
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());
        System.out.println(instructors);


    }
}
