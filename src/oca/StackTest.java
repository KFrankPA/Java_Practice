package oca;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {

        List<Integer> stack = new Stack<Integer>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);

        System.out.println( ( (Stack<Integer>)stack ).pop());

        System.out.println(stack);

        Stack<Integer> stack2 = new Stack<Integer>();

        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        System.out.println(stack2.pop());

        System.out.println(stack2);

        stack2.addElement(45);

        System.out.println(stack2);

        HashSet<Integer> hashset = new HashSet<>();




    }
}
