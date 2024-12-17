import java.util.LinkedList; 
import java.util.Queue; 

public class QueueDemo  
{ 
    public static void main(String[] args)  
     { 
        // Create a Queue using Java's Collection Framework 
        Queue<Integer> queue = new LinkedList<>(); 
        // Add elements to the queue 
        queue.add(10); 
        queue.add(20); 
        queue.add(30); 
        // Display the queue 
        System.out.println("Queue: " + queue); 
        // Remove an element from the queue 
        System.out.println("\nRemoving an element from the queue: " + queue.remove()); 
        System.out.println("Updated Queue: " + queue); 
        // Peek at the front element of the queue 
        System.out.println("\nPeeking at the front element: " + queue.peek()); 
        // Check if the queue is empty 
        System.out.println("\nIs the queue empty? " + queue.isEmpty()); 
        // Check the size of the queue 
        System.out.println("\nSize of the queue: " + queue.size()); 
    } 
} 