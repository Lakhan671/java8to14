package interview.collection;

public class EqualsDemo {
}
class Flight{

    private String name;
    Flight(String name){
        this.name=name;
    }
    public boolean equals(Flight f){
        return f.name.equals(this.name);
    }

    public static void main(String[] args) {
        Flight flight = new Flight("Emirates");
        Flight flight2 = new Flight("Emirates");
        System.out.println(flight.equals(flight2));
        System.console().writer().println(879877);


    }}