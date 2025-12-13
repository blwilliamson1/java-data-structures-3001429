import java.util.*;

public class QueueExamples {

  public static void main(String[] args) {

    Queue<String> queue = new ArrayDeque<>();
//    Queue<String> queue = new PriorityQueue<>();
    queue.offer("Person One");
    queue.offer("Person Two");
    queue.offer("Person Three");
//    Queue<String> priorityQueue = new PriorityQueue<>();
//    priorityQueue = queue;

    Deque<String> stack = new ArrayDeque<>();
    stack.push("Dish 1");
    stack.push("Dish 2");
    stack.push("Dish 3");

    System.out.print("Stack: ");
    System.out.println(stack);
    System.out.print("Queue: ");
    System.out.println(queue);
//    System.out.print("PriorityQueue: ");
//    System.out.println(priorityQueue);
    System.out.println();

//    System.out.println("priorityQueue.peek()");
//    System.out.println(priorityQueue.peek());
//    priorityQueue.poll();
//    System.out.println(priorityQueue);
//    System.out.println();

    System.out.println(queue.peek());
    queue.poll();
    System.out.println(queue);
    
  }

}
