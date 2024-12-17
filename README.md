# Queue in Data Structures

## Introduction

A **queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle. This means that the first element added to the queue is the first one to be removed. The queue supports two main operations:

- **Add (Enqueue)**: Adds an element to the back of the queue.
- **Remove (Dequeue)**: Removes the element from the front of the queue.

Other common operations include:
- **Peek**: Returns the front element without removing it from the queue.
- **isEmpty**: Checks whether the queue is empty.
- **Size**: Returns the number of elements in the queue.

Queues are used in scenarios like scheduling tasks, managing resources, and implementing breadth-first search (BFS) in graphs.

## Queue Operations

1. **Add (Enqueue)**: Adds an element to the back of the queue.
2. **Remove (Dequeue)**: Removes the front element from the queue.
3. **Peek**: Returns the front element without removing it.
4. **isEmpty**: Returns true if the queue is empty.
5. **Size**: Returns the number of elements in the queue.

## Example Code in Java

```java
import java.util.LinkedList; 
import java.util.Queue; 

public class QueueDemo { 
    public static void main(String[] args) { 
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
```
## Output
```
Queue: [10, 20, 30]

Removing an element from the queue: 10
Updated Queue: [20, 30]

Peeking at the front element: 20

Is the queue empty? false

Size of the queue: 2
```
