package functionprogramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo2 {
    public static void main(String[] args) {
        List<Instructor>instructors=Instructors.getAll();
        BiConsumer<String,String>biConsumer=(name,gender)->{
            System.out.println("name is "+name+",  gender is "+gender);
        };
        BiConsumer<String,List<String>>biConsumer1=(name,courses)->{
            System.out.println("Name: "+name+" courses List: "+courses);
        };
        instructors.forEach(instructor -> {
            biConsumer.accept(instructor.getName(),instructor.getGender());
        });

        instructors.forEach(instructor ->{
            biConsumer1.accept(instructor.getName(),instructor.getCourses());
        });


    }
}
