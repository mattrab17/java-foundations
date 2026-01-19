How does an ArrayList store data?

  -An arraylist takes values and stores them in a list.
  -Data is stored and linked to a memory address, making it easy to add and retrieve values. 
  -A default ArrayList is size 10. If a user were to add an 11th item, the ArrayList would have to copy over all 10 items which takes O(n) time and increase its size. The ArrayList in this case would increase its size by 50%, which means it overallocates to ensure it doesn't have to constantly perform an expensive size increase operation
  
Why is removing the middle item is expensive?
  
  -Because an ArrayList changes dynamically depending on the amount of elements it holds, if a user were to remove the middle item, the ArrayList would have to fill in that gap. The gap would be filled by taking every single element to the right and shifting them all one spot to the left until every gap is filled. This can take O(n) time because we can have up to n elements

  ->ArrayLists use contiguous memory, which means every element sits right next to each other. There cannot be a hole in memory, so the gap must be filled