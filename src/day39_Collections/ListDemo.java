package day39_Collections;

import java.util.ArrayList;
import java.util.LinkedList;

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





    }
}
