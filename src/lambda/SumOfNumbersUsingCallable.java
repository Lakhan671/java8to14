package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallable {
    public  static  int[] array= IntStream.rangeClosed(0,5000).toArray();
    public  static  int total= IntStream.rangeClosed(0,5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable callable=()->{
            int sum=0;
            for(int a:array){
                sum+=a;
            }
            return sum;
        };
        Callable callable1=()->{
            int sum=0;
            for(int a:array){
                sum+=a;
            }
            return sum;
        };
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        List<Callable<Integer>>taskList= Arrays.asList(callable,callable1);
        List<Future<Integer>>results=executorService.invokeAll(taskList);
        int k=0;
        int sum=0;
        for(Future<Integer> result:results){
            sum=sum+result.get();
            System.out.println("Sum of "+ ++k+" is :" +sum);
        }
        System.out.println("Sum of two callable is : "+sum);
    }
}
