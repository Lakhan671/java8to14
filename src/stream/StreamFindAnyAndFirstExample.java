package stream;

import functionprogramming.Instructor;
import functionprogramming.Instructors;

import java.util.Optional;

public class StreamFindAnyAndFirstExample {
    public static void main(String[] args) {
        Optional<Instructor> instructorOptional = Instructors.getAll().stream()
                .findAny();
        if(instructorOptional.isPresent())
            System.out.println(instructorOptional.get());

        instructorOptional = Instructors.getAll().stream().findFirst();
        if (instructorOptional.isPresent())
            System.out.println(instructorOptional.get());


    }
}
