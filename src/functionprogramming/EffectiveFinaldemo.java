package functionprogramming;

import java.util.List;

public class EffectiveFinaldemo {
    public static void main(String[] args) {
        List<Instructor> instructors=Instructors.getAll();
       // int k=0;
        instructors.forEach(i->{
          //  System.out.println(++k);
        });
    }
}
