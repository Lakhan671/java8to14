package interview;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CashRegister {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        Scanner fileScanner = new Scanner(file);

        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            if(!line.equalsIgnoreCase("")){
                String elements[] = line.split(";");
                float price = Float.parseFloat(elements[0]);
                float cash = Float.parseFloat(elements[1]);

                double change = cash - price;

                if(change < 0){
                    System.out.println("ERROR");
                }else if(change == 0){
                    System.out.println("ZERO");
                }else{
                    System.out.println(findChange(change));
                }
            }
        }
        fileScanner.close();
    }

    private static String findChange(double change){

        String outPut = "";
        int aChange = (int)(Double.valueOf(new DecimalFormat("########.##").format(change)) * 100);
        while(aChange >= 0.01){
            if(aChange >= 10000){
                outPut += "ONE HUNDRED,";
                aChange -= 10000;
            } else if(aChange >= 5000){
                outPut += "FIFTY,";
                aChange -= 5000;
            } else if(aChange >= 2000){
                outPut += "TWENTY,";
                aChange -= 2000;
            } else if(aChange >= 1000){
                outPut += "TEN,";
                aChange -= 1000;
            } else if(aChange >= 500){
                outPut += "FIVE,";
                aChange -= 500;
            } else if(aChange >= 200){
                outPut += "TWO,";
                aChange -= 200;
            } else if(aChange >= 100){
                outPut += "ONE,";
                aChange -= 100;
            } else if(aChange >= 50){
                outPut += "HALF DOLLAR,";
                aChange -= 50;
            } else if(aChange >= 25){
                outPut += "QUARTER,";
                aChange -= 25;
            } else if(aChange >= 10){
                outPut += "DIME,";
                aChange -= 10;
            } else if(aChange >= 5){
                outPut += "NICKEL,";
                aChange -= 5;
            } else if(aChange >= 1){
                outPut += "PENNY,";
                aChange -= 1;
            }
        }
        return outPut.substring(0, outPut.length() - 1);
    }
}
