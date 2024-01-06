package java14;

public class PatternMatching {
    public static void main(String[] args) {
        AA a=new BB();
        /*if(a instanceof BB b){
            b.printAA();
        }*/
    }
}
class AA{

}

class BB extends  AA{
    public static void printAA(){
        System.out.println("AAA");
    }
}