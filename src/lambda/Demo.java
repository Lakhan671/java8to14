package lambda;

import javax.management.relation.RoleList;
import javax.sound.sampled.Line;
import java.nio.file.DirectoryStream;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Demo {


    public static void main(String[] args) throws ParseException {
          String str="IOException | dcdcdacadcac acascasc";
        System.out.println(str.split("\\|")[1]);
    }
}
class T2 extends Thread{
    public void run(){
        for(int i=0;i<500;i++){
            System.out.println("lets run "+ i);
        }
    }
}