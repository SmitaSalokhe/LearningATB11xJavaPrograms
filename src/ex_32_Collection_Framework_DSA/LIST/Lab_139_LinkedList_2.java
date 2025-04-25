package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;
import java.util.List;

public class Lab_139_LinkedList_2
{
    public static void main(String[] args) {
        LinkedList<String> animal = new LinkedList();
        animal.add("Dog");
        animal.add("Cat");
        animal.addFirst("Lion");
        animal.addLast("Tiger");

        System.out.println(animal);
        System.out.println(animal.size());

        // Accessing elements
        System.out.println("First animal = "+ animal.getFirst());
        System.out.println("Last animal = "+ animal.getLast());

        // Removing elements
        animal.removeFirst();
        animal.removeLast();
        System.out.println("LinkedList after removal: " + animal);

        System.out.println(animal.size());


    }
}
