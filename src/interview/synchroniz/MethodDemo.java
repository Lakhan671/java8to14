package interview.synchroniz;

public class MethodDemo {
    void go(){
       /* synchronized (){

        }*/

    }
    public synchronized void go1(){

    }
    void go2(){
        synchronized (Object.class){

        }
    }
    void go3(){
        Object o=new Object();
        synchronized (o){

        }
    }
}
