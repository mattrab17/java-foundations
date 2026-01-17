package src.week2.wednesday;
import java.util.Queue;
import java.util.LinkedList;




/*
HW:
Implement:
Add 5 integers to a queue
Remove 2
Peek
Print remaining

*/
public class QueuePractice {

  public static void main(String[]args){
    

    //=======================================QUEUE METHOD PRACTICE===============================================
    Queue<Integer> queue = new LinkedList();

    //ADDING TO A QUEUE (offer a spot in line)
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    queue.offer(4);
    queue.offer(5);

    System.out.println(queue);

    //REMOVE FROM A QUEUE (poll them out)
    queue.poll();
    queue.poll();

    System.out.println(queue);

    //PEEK THE QUEUE (check what's in the head)
    System.out.println(queue.peek());

    //Print remaining elements
    System.out.println(queue);


    //===================================LINE AT A GROCERY STORE SIMULATION=========================================

 
    Queue<String> line = new LinkedList();

    line.offer("James");
    line.offer("Joe");
    line.offer("Daniel");

    System.out.println("Current queue: " + line);

     

    System.out.println(line.poll() + " has been helped");
    System.out.println("New queue: " + line);
    

  }
  
}
