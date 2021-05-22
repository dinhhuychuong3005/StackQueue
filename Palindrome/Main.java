package Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String test = "Able was I ere I saw Able";
        String [] test1 = test.split(" ");
        Stack<String> stack = new Stack<>();
        Queue<String> strings = new LinkedList<>();
        for (int i = 0;i< test1.length;i++){
            stack.add(test1[i]);
            strings.add(test1[i]);
        }
        System.out.println("Stack: " + stack);
        System.out.println("Queue: " + strings );
        boolean result = true;
        for (int i = 0;i<test1.length;i++){
            if (stack.pop().equals(strings.poll())){
                result = true;
            }else {
                result = false;
            }
        }
        System.out.println(result);
    }
}
