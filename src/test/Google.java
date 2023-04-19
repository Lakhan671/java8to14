package test;

public class Google {
    public static void main(String[] args) {
        int[] arr=new int[]{23,21,45,  1, 6,7,54,86,11};
      

        int[]a=new int[arr.length];
        for(int i: arr){
           int p=i/10;
           if(a[p]==0){
               a[p]=i;
           }else{
               if(a[p]<i){

               }
           }

        }
    }
}
