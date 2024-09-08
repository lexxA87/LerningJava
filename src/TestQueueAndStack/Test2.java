package TestQueueAndStack;

import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(0);
        stack.push(24);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack);

        while (!stack.empty()) System.out.println(stack.pop());
    }
}
