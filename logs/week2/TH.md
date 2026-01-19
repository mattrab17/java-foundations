Reflection Questions:

When LinkedList is better than ArrayList
  -LinkedLists are better for removal and insertion at the head and tail nodes.
  -ArrayLists would have to shift everything to insert a value



When it’s worse:

  LinkedLists are worse than ArrayLists at random access or retrieval. Unlike ArrayLists, LinkedLists do not have indexes for each of their items, so to retrieve or access a value the computer must go through each node one by one until the value is found.

  In a singly linked list, the computer starts searching from the Front and travels to the back
  In a doubly linked list, the computer can search starting from the front and travel to the back, and vice versa


    Method            ArrayList                      LinkedList
  get()                 O(1)find memory address     O(n)check each node
  add/remove(front)     O(n)shift                    O(1)pointer swap
  add/remove(middle)    O(n)shift                   O(n)check each node

ArrayLists illustration -> a row of lockers in a hallway. They are contiguous, which means every element sits in a single and unbroken block of memory addresses. This is why random access is super efficient in ArrayLists.

LinkedLists illustration -> A scavenger hunt. They are non contiguous, which means the elements or nodes are scattered all over the RAM whenever there is a spot. They are never next to each other. To find the next node, you have to use a pointer. Adding and removing from the head and tail are super efficient in LinkedLists.


If LinkedLists are so good at inserting, why don't we use them for everything?:

  When you store data in an ArrayList, you store only the data and nothing else. The index is created for you as you add more data.
  In contrast, in a LinkedList, for every 1 piece of data two pointers are stored: one for the previous and one for the next nodes

  As a result, this means that LinkedLists take up more data to store the exact same amount of information as an ArrayList







