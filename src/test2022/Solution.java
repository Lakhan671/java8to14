package test2022;

public class Solution {
    private static Object executor1=new Object();
    private static Object executor2=new Object();

    public static void main(String[] args) {
        new Thread(()->{
            synchronized (executor1){
                System.out.println(Thread.currentThread()+"get ececutor1");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+" waiting get executor2");
                synchronized (executor2){
                    System.out.println(Thread.currentThread()+" get executor2");
                }
            }
        },"thread").start();

        new Thread(()->{
            synchronized (executor1){
                System.out.println(Thread.currentThread()+"get ececutor2");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+" waiting get executor1");
                synchronized (executor2){
                    System.out.println(Thread.currentThread()+" get executor1");
                }
            }
        },"thread").start();
    }
}
