package test2022;

public class HakerEarth {
    public void print(Integer i){
        System.out.println("Integer");
    }
    public void print(int i){
        System.out.println("int");
    }
    public void print(long l){
        System.out.println("long");
    }
    public static void main(String[] args) {
        HakerEarth hakerEarth=new HakerEarth();
        hakerEarth.print(10);
    }
}
