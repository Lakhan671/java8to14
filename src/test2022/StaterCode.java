package test2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

 class Employee {


    private int empId;

    private String firstName;

     private String lastName;

    public Employee(int empld, String firstName, String lastName) {
        this.empId=empld;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
         if(empId != employee.empId){
             return  false;
         }
         if(lastName==null){
            return  employee.lastName==null;
         }else{
             return  firstName.equals(employee.firstName);
         }



    }

    @Override
    public int hashCode() {
        final int prime=31;
        int result=1;
        result=prime*result+empId;
        result=prime*result+((firstName==null)?0:firstName.hashCode());
        result=prime*result+((lastName==null)?0:lastName.hashCode());
        return result;
    }
}
class Address {
    private int houseNo;
    String streatName;
    ;
    String city;
    int pinCode;

    public Address(int h, String st, String cit, int pc) {
        this.houseNo = h;
        this.streatName = st;
        this.city = cit;
        this.pinCode = pc;

    }

    public String getAddress() {
        return houseNo + ", " + streatName + ", " + city + ", " + pinCode;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + houseNo;
        result = prime * result + ((streatName == null) ? 0 : streatName.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + pinCode;
        return result;
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        Address other = (Address) o;
        if (houseNo != other.houseNo) {
            return false;
        }
        if (pinCode != other.pinCode) {
            return false;
        }
        if (streatName == null) {
            if (other.streatName != null) {
                return false;

            }

        } else if (!city.equals(other.city)) {
            return false;
        }
        return true;


    }
}
public class StaterCode {
    public static String getAddress(Map map, Employee emp) {
        Address ad = (Address) map.get(emp);
        return ad.getAddress();
    }

    public static void main(String[] args) {
        Employee emp1=new Employee(111,"Alice","Singh");
        Address address=new Address(203,"Seepz","Mumbai",400093);
        Employee emp2=new Employee(110,"Bob","Singh");
        Address address2=new Address(304,"Marol Mahrisi","Mumbai",400069);
        Map<Employee,Address>map=new HashMap<>();
        map.put(emp1,address);
        map.put(emp2,address2);
        System.out.println(StaterCode.getAddress(map,new Employee(110,"Alice","Kapoor")));
    }
}