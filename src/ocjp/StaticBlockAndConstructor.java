package ocjp;

public class StaticBlockAndConstructor {
    public static void main(String[] args) {
  new Level2();
    }
}

class Level1{
    Level1(){
        System.out.println("Level-1 Constructor");
    }
    {
        System.out.println("Level-1 Block");
    }
    static {
        System.out.println("Level-1 Static");
    }
}

class Level2  extends  Level1{
    Level2(){
        System.out.println("Level-2 Constructor");
    }
    {
        System.out.println("Level-2 Block");
    }
    static {
        System.out.println("Level-2 Static");
    }
}
