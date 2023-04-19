package java10;

import java.util.stream.*;
import java.util.*;

public class Test
{
    public static class Student {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public String getName() {
            return name;
        }
    }

    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {
      Comparator<Student> com=(a,b)-> a.getScore()-b.getScore();
        List<String> names= students.filter(s->s.getScore()>=passingScore).sorted(com).map(t->t.getName()).collect(Collectors.toList());

        return names;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Mike", 80));
        students.add(new Student("James", 57));
        students.add(new Student("Alan", 21));
        studentsThatPass(students.stream(), 50).forEach(System.out::println);
    }
}