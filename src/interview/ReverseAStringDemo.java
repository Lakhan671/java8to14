package interview;

public class ReverseAStringDemo {
    public static void main(String[] args) {
       String str="Lakhan Singh";
       String[] l=str.split("\\s+");
       String output="";
       for(int i=l.length-1;i>=0;i--){
           output+=l[i]+" ";
       }
        System.out.println(output);
       }
    }


