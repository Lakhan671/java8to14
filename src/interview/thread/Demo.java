package interview.thread;


import java.util.Scanner;

public class Demo  {
    public static void main(String[] args) {

        int row = 7;
        for (int i = 0; i < row; i++) {
            for (int j = i; j < row - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
row=7;
      int rn=7;
        for (int i = 0; i < row; i ++) {
          for(int j=0;j<i;j++){
              System.out.print("  ");
          }
          for(int k=1;k<=2*rn-1;k++){
              System.out.print("* ");
          }
          rn--;
            System.out.println();
        }
    }
}