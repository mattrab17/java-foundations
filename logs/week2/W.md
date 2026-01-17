DEBUG + EXPLAIN:

Difference between stack and queue:

  -A Stack follows a LIFO or Last in First Out principle
  -Stacks are best used for tracking the previous actions done (like an undo button or back button)
  -> VERTICAL PILE

  -A Queue follows a FIFO or First in First out principle
  -Queues are best used as buffers to process actions or objects before releasing them to do something (Like a printer or keyboard letter press buffer)
  -> HORIZONTAL LINE (HEAD and TAIL)


Real-world queue examples

  -You press a letter on a keyboard -> letter enters queue -> first letter in queue (FIFO) gets displayed on the screen
  -You set up a printer job -> the print job gets placed in a queue -> print job gets processed -> paper gets printed


What breaks if FIFO isn’t respected?

  -Starvation: If the last object is served instead of the first object, the first object is starved because they aren't helped. This breaks the queue
  
  -Data Integrity: If you type CAT on a keyboard, but FIFO isn't respected, the keyboard will display TAC or ACT, causing the information to be messed up upon being displayed
  
  -Flow Control: Queues act as congestion controllers. If a printer starts printing random pages in the middle of a 100-page document instead of the 1st page, the user can't review until the entire queue is emptied since they need to start from the very beginning.

=============================================
Time Complexity

  -Queues can be implemented as LinkedLists

A linked list is as follows:
          Pointer     Pointer       Pointer
[Data|Next]->[Data|Next]->[Data|Next]->NULL
Head                            Tail
    NODE        NODE          NODE

Pointer = a variable that stores the memory address of the next node

---

Methods:

offer(item)/add(item) -> Computer goes to the "tail pointer" and attaches the new item behind it -> O(1)

poll()/remove() -> Computer goes to the "head pointer", removes the item, and moves the head label to the next item in line -> O(1)

peek() -> Computer looks at the value currently labeled as the "head" -> O(1)

contains() -> If a specific item is in the queue, the computer must go through every item holder until it finds the item -> O(n)

size() -> in a LinkedList, the size is tracked by a counter -> O(1)

print() -> to print the line, you must visit every node exactly once


