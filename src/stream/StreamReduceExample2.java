package stream;

import functionprogramming.Instructor;
import functionprogramming.Instructors;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        Optional<Instructor> instructorList= Instructors.getAll().stream()
                .reduce((s1,s2)->{
                    if(s1.getYearsOfExperience()>s2.getYearsOfExperience())
                        return s1;
                    else
                        return s2;
                });

        System.out.println(instructorList.get());
    }
}
