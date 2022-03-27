import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top of Stack: "+stack.peek());
        System.out.println("Popped Value: "+stack.pop());
        System.out.println("Top of Stack: "+stack.peek());
    }
}
