package oca;

import java.util.Arrays;
import java.util.PriorityQueue;

public class QueueTest {
    public static void main(String[] args) {

        PriorityQueue <Integer> l = new PriorityQueue<>();

        l.add(2);
        l.add(5);
        l.add(7);
        l.add(9);

        System.out.println(l);

        l.offer(7);
        l.offer(79);

        System.out.println(l);

        l.addAll(Arrays.asList(10,20,30,40,50));

        System.out.println(l);

        l.poll();

        System.out.println(l);

        System.out.println(l.add(77));
        System.out.println(l.offer(77777));

        System.out.println(l.peek());


    }
}
