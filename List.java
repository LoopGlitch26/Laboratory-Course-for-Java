public class List
{
  // Methods
  public void store(int item)
  // Pre:  The list is not full 
  // Post: item is in the list
  {
    values[numItems] = item;
    numItems++;
  }
  public void printList()
  // Post: If the list is not empty, the elements are
  //       printed on the screen; otherwise "The list
  //       is empty" is printed on the screen
  {
    // TO BE FILLED IN: Exercise 1
  } 	
  		
  void print(int first, int last)
  {
    // TO BE FILLED IN: Exercise 2  
  } 

  IntList(int maxItems)
  // Constructor
  // Post: Empty list is created with maxItems cells
  {
    numItems = 0;
    values = new int[maxItems];
  }
  // Data fields
  private  int numItems;
  private  int[] values;
}


