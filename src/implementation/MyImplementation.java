package implementation;

import stack.MyStack;
import java.util.Random;

public class MyImplementation {
    public static void main(String[] args) {
        int maxSizeOfStack = 10;
        MyStack stack = new MyStack(maxSizeOfStack);
        int element = stack.peek();
        element = stack.pop();


        boolean check = stack.isEmpty();

        System.out.println("size of stack=" +stack.size());

        stack.push(200);
        System.out.println("size of stack=" +stack.size());
        for(int i = 0; i < 100; i++) {
            stack.push(new Random().nextInt(100));
        }
        System.out.println("size of stack =" + stack.size());
    }
}
