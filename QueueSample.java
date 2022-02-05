package p;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Orange");
        queue.add("Banana");
        queue.add("Watermelon");
     //   queue.remove();//remove first element
        System.out.println(queue.peek());
for(String fruit : queue){
    System.out.println(fruit);
}

        Queue<String> q = new PriorityQueue<>();
        q.add("Apple");
        q.add("Orange");
        q.add("Banana");
        q.remove();// Priority queue sort according to alphabets
       // q.remove();
        for(String fruit : q){
            System.out.println(fruit);
        }
    }
}
