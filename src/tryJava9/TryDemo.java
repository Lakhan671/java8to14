package tryJava9;

import java.io.*;

public class TryDemo {
    public static void main(String[] args) throws IOException {
        Reader reader=new StringReader("my name is Lakhan Singh");
        BufferedReader bufferedReader=new BufferedReader(reader);
        try(bufferedReader){
            System.out.println(bufferedReader.readLine());
        }
    }
}
