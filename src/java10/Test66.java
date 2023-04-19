package java10;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test66 {
    public static void main(String[] args) {
        List<Emp> empList=List.of(new Emp(21,"kunal singh"), new Emp(32,"sonal singh"),new Emp(18,"Lakhan Singh") );
        Predicate<Emp> empPredicate=(emp)->emp.getAge()>30 && emp.getName().toLowerCase().startsWith("s");
        empList.stream().filter(empPredicate).collect(Collectors.toList()).forEach(i->{
            System.out.println(i);

        });
    }
}

class Emp{
    public Emp(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int age;
  private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
