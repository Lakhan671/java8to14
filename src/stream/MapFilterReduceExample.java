package stream;

import functionprogramming.Instructor;
import functionprogramming.Instructors;

public class
MapFilterReduceExample {
    public static void main(String[] args) {
      int exp=  Instructors.getAll().stream()
                .filter(Instructor::isOnlinesCourses)
                .map(Instructor::getYearsOfExperience)
                .reduce(0,Integer::sum);
        System.out.println(exp);

    }
}
