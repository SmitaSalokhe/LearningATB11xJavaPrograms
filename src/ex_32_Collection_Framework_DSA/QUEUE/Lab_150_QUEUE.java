package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.PriorityQueue;

public class Lab_150_QUEUE
{
    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
        PriorityQueue q = new PriorityQueue();
        q.add("Smita");
        q.add("Dhere");
        // PQ -> Natural - Sorting
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println("----------------------------------");
        System.out.println(q.add("Salokhe"));
        System.out.println(q.poll());         //for remove
        System.out.println(q);

    }

}
