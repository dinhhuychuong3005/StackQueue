package bt3;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Before:");
        for (Integer integer : stack){
            System.out.println(integer);
        }
        System.out.println("After:");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        String first = "Hello mword";
        String[] a = first.split(" ");
        Stack<String> stack1 = new Stack<>();
        System.out.println("Before");
        for (int i = 0; i < a.length; i++) {
            stack1.push(a[i]);
        }
        System.out.println(stack1);
       while (!stack1.isEmpty()){
           System.out.println(stack1.pop());
        }
    }

}
