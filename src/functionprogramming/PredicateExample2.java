package functionprogramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        Predicate<Instructor> p1=(i)->i.isOnlinesCourses()==true;
        Predicate<Instructor>p2=i->i.getYearsOfExperience()>10;
        List<Instructor>instructors=Instructors.getAll();
        instructors.forEach(instructor -> {
            if(p1.and(p2).test(instructor)){
                System.out.println(instructor);
            }
        });
    }
}
