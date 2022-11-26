package interview.genric;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<? extends  Animal> animal1=new ArrayList<>();
          List<? super Animal> aObjects=new ArrayList<>();
          aObjects.add(new Dog());
          aObjects.add(new Animal());
          //aObjects.add(AnyAnimal());
    }
}
abstract  class AnyAnimal{
    AnyAnimal(){

    }
}
class Animal{

}
class Dog extends  Animal{

}
class Cat extends  Animal{

}