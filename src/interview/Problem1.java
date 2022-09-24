package interview;

/**
 * Given an array of sorted integers, find if the sum of two elements in the array,
 * is equal to the provided element.
 * Example 1: [1,3,5,6], 8 -> true
 * Example 2: [1,2,5,6], 8 -> true
 * Example 2: [2,3,4,7], 8 -> false
 */

public class Problem1 {
    public static void main(String[] args) {
    int[] arr1=new int[]{1,3,5,6};
       int sum1=8;
        Problem1 p1=new Problem1();
        System.out.println(p1.hasSum(arr1,sum1));
         arr1=new int[]{1,2,5,6};
        System.out.println(p1.hasSum(arr1,sum1));
        arr1=new int[]{2,3,4,7};
        System.out.println(p1.hasSum(arr1,sum1));

    }
    boolean hasSum(int []arr, int sum) {
           int n=0, c=0,i=0;;
           while(n!=sum && i!=arr[arr.length-1]){
                if(c<arr.length-1){
                    n=sum-arr[i];
                    if(arr[c+1]==n){
                        return true;
                    }else{
                        n=arr[i]+arr[c+1];
                        c++;
                    }
                }else{
                            c = ++i;
                    }
                }
        return false;
    }
}
