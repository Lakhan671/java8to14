package interview;

public class FinalClassDemo {
    public static void main(String[] args) {
        Add4 a=new Add4();
        a.setCity("Noida");
        final Emp4 e=new Emp4("Lakhan",a);
        a.setCity("Delhi");
        System.out.println(e.getAdd().getCity());

    }
}

 class Add4{
    private String city;
    
     protected Add4 clone()  {
        Add4 a=new Add4();
        a.setCity(this.getCity());
        return a;
     }

     public String getCity() {
         return city;
     }

     public void setCity(String city) {
         this.city = city;
     }
 }
final class Emp4{
    private final String name;
    private final Add4 add;
    Emp4(String name,Add4 add){
        this.add= add.clone();
        this.name=name;
    }



    public Add4 getAdd() {
        return add;
    }

    public String getName() {
        return name;
    }


}