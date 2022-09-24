package interview;

/**
 * Given two sorted arrays, which contain positive integers.
 * Merge both and produce third array in sorted order.
 * Array 1: [1,3,5,7,8]
 * Array 2: [2,4,6,9,10]
 * Result: [1,2,3,4,5,6,7,8,9,10]
 */
public class Problem2 {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,3,5,7,8};
        int[] arr2=new int[]{2,4,6,9,10};
        Problem2 p2=new Problem2();
        int[] result=p2.merge(arr1,arr2);
         for(int i=0;i<result.length;i++){
             System.out.print(i<result.length-1?result[i]+", ": result[i]);
         }
    }
    int[] merge(int []arr1, int []arr2) {
        int[] mergeArray = new int[arr1.length + arr2.length];
        int arr1Length = arr1.length - 1, arr2Length = arr2.length - 1, length = mergeArray.length;

        while (length > 0) {
            mergeArray[--length] = (arr2Length < 0 || (arr1Length >= 0 && arr1[arr1Length] >= arr2[arr2Length])) ? arr1[arr1Length--] : arr2[arr2Length--];
        }
            return mergeArray;
    }
}
