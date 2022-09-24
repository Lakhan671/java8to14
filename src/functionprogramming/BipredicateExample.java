package functionprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BipredicateExample {
    public static void main(String[] args) {
        List<Instructor> instructors=Instructors.getAll();

        BiPredicate<Boolean,Integer>p3=(online,experience)-> online && experience>10;

        BiConsumer<String, List<String>> stringListBiConsumer=(name, courses)->{
            System.out.println("Name: "+ name+" courses: "+courses);
        };
        instructors.forEach(instructor -> {
           if(p3.test(instructor.isOnlinesCourses(),instructor.getYearsOfExperience())){
               System.out.println(instructor);
           }
        });
    }
}
