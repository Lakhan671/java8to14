package interview.innerclass;

public class FinalClassDemo {
    public static final void main(String[] args) {
        Employee.Details employee=new Employee().new Details();
        System.out.println(employee.getDetails());
        Employee.Details2 details2=new Employee.Details2();
        System.out.println(details2.getDetails());
        Details3 details3=new Employee();
        //details3.getDetails();
        Employee employee1=new Employee.Details2();
        System.out.println(employee1.getDetails());;
        System.out.println(Employee.class.getFields());

    }
}

 class Employee extends  Details3{

    class Details{
         String getDetails(){
            return "my name is Lakhan Singh";
        }
    }
    static class Details2 extends  Employee{
        String getDetails() throws RuntimeException{
            return "my name is Lakhan Singh";
        }
    }
       String getDetails(){
         return "my name is Lakhan Singh";
     }
}

class Details3{
    /* String getDetails(){
        return "my name is Lakhan Singh";
    }*/
}