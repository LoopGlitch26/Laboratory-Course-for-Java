public class LinkedSorted 
{
	int numItems;    // Number of items on the list
	Node listPtr;    // External name of the list

	public LinkedSorted()
	{
	  numItems = 0;
	  listPtr = null;
	}		
	public void insert(String newItem)
	{
	  numItems++;
	  Node currentPtr = listPtr;
	  Node prevPtr = null;
	  Node newNode = new Node(newItem);
	  if (listPtr == null)
	    listPtr = newNode;
	  else
	  {
	    while (currentPtr != null && 
             currentPtr.getItem().compareTo(newItem) < 0)
	    {
	      prevPtr = currentPtr;
	      currentPtr = currentPtr.getNext();
	    }

	    if (prevPtr == null)          // First item
	    {
	      newNode.setNext(listPtr);
	      listPtr = newNode;
	    }
	    else
	    {
	      newNode.setNext(prevPtr.getNext());
	      prevPtr.setNext(newNode);
	    }
	  }
	}
	public void print()
	{
	  Node currentPtr = listPtr;
	  while (currentPtr != null)
	  {
	    System.out.println(currentPtr.getItem());
	    currentPtr = currentPtr.getNext();
	  } 
	}
}


