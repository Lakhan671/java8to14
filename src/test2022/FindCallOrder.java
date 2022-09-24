package test2022;

public class FindCallOrder {
    public void myMethod(){
        System.out.print("Company ");
    }
    {
        System.out.print("Fortune one ");
    }
    public FindCallOrder(){
        System.out.print("is a ");
    }
    static {
        System.out.print("walmart ");
    }

    public static void main(String[] args) {
        FindCallOrder f=new FindCallOrder();
        f.myMethod();
    }
}
