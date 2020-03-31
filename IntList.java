public class IntList
{
  // Methods
  public void store(int item)
  // Pre:  The list is not full 
  // Post: item is in the list
  public void printList()
  // Post: If the list is not empty, the elements are
  //       printed on the screen; otherwise "The list
  //       is empty" is printed on the screen
  public int getLength()
  // Post: return value is the number of items in the list
  public boolean isEmpty()
  // Post: returns true if list is empty; false otherwise
  public boolean isFull()
  // Post: returns true if there is no more room in the
  //       list; false otherwise
  IntList(int maxItems)
  // Constructor
  // Post: Empty list is created with maxItems cells

  // Data fields
  private  int numItems;
  private  int[] values;
}

