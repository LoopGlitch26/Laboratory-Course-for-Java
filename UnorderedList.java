public class  UnorderedList
{
  public UnorderedList()
  // Post: List is the empty list.

  public boolean  contains(String  item)
  // Post: If item is in the list contains is   
  //       True; False, otherwise                      

  public void add(String  item)
  // Pre:  item is not already in the list             
  // Post: item is in the list  

  public void resetList()
  // Post: Iteration variable has been set

  public String next()
  // Pre:  An unseen item remains
  //       The list has not been changed since the
  //       last call to this method
  // Post: The item is returned; the list is unchanged

  public boolean hasNext()
  // Post: Returns true if there is an unseen item;
  //       returns false otherwise

  private Node listPtr;
  private Node iterPtr;
}

