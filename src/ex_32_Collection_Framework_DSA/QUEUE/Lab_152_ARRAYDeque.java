package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab_152_ARRAYDeque
{
    public static void main(String[] args) {
        Deque<Integer>deck = new ArrayDeque();
        deck.push(10);
        deck.push(50);
        System.out.println(deck);
    }
}
