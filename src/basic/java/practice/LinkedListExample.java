package basic.java.practice;

import java.util.LinkedList;

public class LinkedListExample {

    public void linkedListExample() {
        LinkedList linkedlist = new LinkedList();
        /*add(String Element) is used for adding 
         * the elements to the linked list*/
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " +linkedlist);
        /*Add First and Last Element*/
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        /*Display Linked List Content*/
        System.out.println("Linked List Content: " +linkedlist);
        
        /*This is how to get and set Values*/
        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " +firstvar);
        linkedlist.set(0, "Changed first item");
        Object firstvar2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " +firstvar2);
        /*Display Linked List Content*/
        System.out.println("Linked List Content: " +linkedlist);
        
    }
}
