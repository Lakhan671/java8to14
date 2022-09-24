package interview;

public class FBSDemo {
    public static void main(String[] args) {
        printFibonacci(0,1,9);
    }

    private static  void printFibonacci (int a,int b,int count) {
        if (a == 0 ||(a==1 || b==1)) {
            System.out.print(a+" ");
        } else {
            System.out.print(b+" ");
        }
        int temp = a + b;
        a = b;
        b = temp;
        count--;
        if (count > 0) {
            printFibonacci(a, b, count);
        }
    }
}

