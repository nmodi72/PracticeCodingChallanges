package basic.java.practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    private static String PRINT_NAME = "Hi, [%s]";
    
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {

            @Override
            public int compare(String str1, String str2) {
                if (str1.length() < str2.length()) {
                    return -1;
                }
                if (str1.length() > str2.length()) {
                    return 1;
                }
                return 0;
            }
        }; 
                
        PriorityQueue<String> queue =  new PriorityQueue<String>(10, comparator);
        queue.add("short");
        queue.add("nirav1");
        queue.add("modi");
        queue.add("Saloni");
        queue.add("nirav");
        while (queue.size() != 0)
        {
            System.out.println(queue.remove());
        }
        String name = "Nirav";
        System.out.println(String.format(PRINT_NAME, name));
        
//        List<String> stringList = new LinkedList();
//        stringList.add("Hello");
//        stringList.add("Nirav");
//        stringList.add("Saloni");
//        stringList.add("Modi");
//        stringList.add("Hi There");
//        stringList.add("World");
//        
//        stringList.sort("Hello", "");
    }
}

