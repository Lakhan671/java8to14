package test;

// Driver Code
public class Main2 {
    public static void main(String[] args)
    {
        MyStack s = new MyStack();

        // Function calls
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
}
