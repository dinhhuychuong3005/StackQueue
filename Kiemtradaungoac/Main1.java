package Kiemtradaungoac;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 biểu thức");
        String original = sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == '(') {
                stack.push(i);
            } else if (original.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }

        if (stack.empty()) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
