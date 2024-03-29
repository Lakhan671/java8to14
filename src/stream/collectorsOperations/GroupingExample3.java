package stream.collectorsOperations;


import functionprogramming.Instructor;
import functionprogramming.Instructors;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class GroupingExample3 {
    public static void main(String[] args) {
        //grouping by length of string and also checking that the names contains e
        //and only return those name which has e in it
        List<String> name = List.of("Sid", "Mike", "Jenny", "Gene", "Rajeev");
        LinkedHashMap<Integer, List<String>> result = name.stream()
                .collect(Collectors.groupingBy(String::length, LinkedHashMap::new, Collectors
                        .filtering(s-> s.contains("e"),Collectors.toList())));

        System.out.println("result = " + result);
        System.out.println("------------------");

        //instructor grouping them by Senior(>10) and Junior(<10) and filter them
        //on online courses
        LinkedHashMap<String, List<Instructor>> instructorByExpAndOnline = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(instructor ->
                        instructor.getYearsOfExperience()>10 ? "SENIOR": "JUNIOR",
                        LinkedHashMap::new, Collectors.filtering(s->s.isOnlinesCourses(),
                                Collectors.toList())));

        instructorByExpAndOnline.forEach((key, value) -> {
            System.out.println("key  = " + key + " value = " + value);
        });
        Instructors.getAll().stream().collect(Collectors.groupingBy(i->i.getYearsOfExperience()>10?"S":"J",
                HashMap::new,Collectors.mapping(Instructor::getName,Collectors.toList()))).forEach((key,value)->{
            System.out.println("key="+key+"  Value="+value);
        });
    }
}
