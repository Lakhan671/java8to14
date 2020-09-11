package stream.collectorsOperations;

import functionprogramming.Instructor;
import functionprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMappingExample {
    public static void main(String[] args) {
        List<String>namesList= Instructors.getAll().stream()
                .map(Instructor::getName).collect(Collectors.toList());
        //mapping
        System.out.println(namesList);
        namesList=Instructors.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName,Collectors.toList()));
        System.out.println(namesList);
        //Instructors by their years of experience
        Map<Integer, List<String>> mapYearsOfExperienceAndNames = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearsOfExperience,
                        Collectors.mapping(Instructor::getName, Collectors.toList())));

        mapYearsOfExperienceAndNames.forEach((key,value) ->{
            System.out.println("key = " + key + " value = " + value);
        });

    }
}
