public class Node
{
  String item;     // Items on the list
  Node next;       // Pointer to the next node

  public Node(String newItem)
  {
    item = newItem;
    next = null; 
  }
  public Node()
  {
    item = "";
    next = null;
  }
  public void setNext(Node pointer)
  {
    next = pointer;
  }
  public Node getNext()
  {
    return next;
  }
  public String getItem()
  {
    return item;
  } 	
}


