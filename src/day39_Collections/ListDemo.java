package day39_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); //Array based class ====> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(500);

        arrayList.remove(0);

        arrayList.get(0);

        LinkedList <Integer> linkedList = new LinkedList<>(); // Node based class (double linked list) ==> add(), remove() faster

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(500);

        linkedList.remove(0);

        linkedList.get(0);


        System.out.println("=======================================");

        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);
        vector.add(400);
        vector.add(500);


        System.out.println("=======================================");

        Stack <Integer> stack = new Stack<>();

        stack.add(100);
        stack.add(200);
        stack.add(300);
        System.out.println(stack);

        int a = stack.pop();
        System.out.println(a);
        System.out.println(stack);

        stack.pop();

        System.out.println(stack);


    }
}
