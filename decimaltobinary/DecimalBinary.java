package decimaltobinary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên");
        int decimal = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        System.out.println("Trước khi chuyển: " + decimal );
        System.out.println("Sau khi chuyển: ");
        while (decimal!=0){
            int temp = decimal % 2;
            decimal = decimal/2;
            stack.push(temp);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
