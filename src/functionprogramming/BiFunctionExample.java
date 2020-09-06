package functionprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiFunctionExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1=(p)->p.isOnlinesCourses()==true;
        BiFunction<Predicate<Instructor>,List<Instructor>, Map<String,Integer>> mapFunction=(pp,instructors )-> {
            Map<String,Integer>map=new HashMap<>();
            instructors.forEach(instructor -> {
                if(pp.test(instructor)) {
                    map.put(instructor.getName(), instructor.getYearsOfExperience());
                }
            });
            return map;
        };
        System.out.println(mapFunction.apply(p1,Instructors.getAll()));
    }
}
