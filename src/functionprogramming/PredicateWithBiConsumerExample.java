package functionprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateWithBiConsumerExample {
    public static void main(String[] args) {
        List<Instructor> instructors=Instructors.getAll();
        Predicate<Instructor> p1=p->p.isOnlinesCourses()==true;// && p.getYearsOfExperience()>10;
       Predicate<Instructor>p2=p->p.getYearsOfExperience()>10;
        BiConsumer<String,List<String>>stringListBiConsumer=(name,courses)->{
            System.out.println("Name: "+ name+" courses: "+courses);
        };
        instructors.forEach(instructor -> {
            if(p1.and(p2).test(instructor)){
                stringListBiConsumer.accept(instructor.getName(),instructor.getCourses());
            }
        });
    }
}
