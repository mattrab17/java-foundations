package src.week2.thursday;
import java.util.LinkedList;
public class LinkedListPractice {

  public static void main(String[]args){

    /*
    Using Java’s LinkedList:
    1. Add elements
    2. Remove from front
    3. Remove from middle
    4. Print list

    */

    LinkedList<Integer> list = new LinkedList();

    //ADD method. LinkedList as a stack
    
    list.push(6);
    list.push(7);
    list.push(8);
    

    System.out.println(list);

    //ADD method. LinkedList as a queue
  
    LinkedList list2 = new LinkedList<>();
    list2.offer(6);
    list2.offer(7);
    list2.offer(8);

    System.out.println(list2);

    //Removing from a Linkedlist as a stack

    list.pop();

    System.out.println(list);

    //Removing from a LinkedList as queue

    list2.poll();

    System.out.println(list2);

    //Add method as a regular LinkedList

    LinkedList<Integer> list3 = new LinkedList();

    list3.add(1);
    list3.add(2);
    list3.add(3);

    System.out.println(list3);

    list3.add(1,4);

    System.out.println(list3);

    //Remove method as a regular LinkedList

    list3.remove(0); //remove first index

    System.out.println(list3);

    list3.remove(list3.size()/2); //remove middle index

    System.out.println(list3);

    
    

    






  }
  
}
