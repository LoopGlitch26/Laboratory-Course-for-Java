// Code fragment to create an unordered linked list

Node listPtr;     // External pointer to the list
Node currentPtr;  // Running pointer
listPtr = new Node(inData.nextLine()); // Get first string
currentPtr = listPtr;
while (inData.hasNextLine())
{
  currentPtr.setNext(new Node(inData.nextLine()));
  currentPtr = currentPtr.getNext();
}


// Code fragment to traverse a linked list
currentPtr = listPtr;
while (currentPtr.getNext() != null)
{
  System.out.println(currentPtr.getItem());
  currentPtr = currentPtr.getNext();
}


// Code fragment to add an item to the list
Node newNode = new Node(newItem);
newNode.setNext() = listPtr;
listPtr = newNode;


// Code fragment to insert an item in a sorted list
Node newNode = new Node(newItem);
Node currentPtr = listPtr;
Node prevPtr = null;
numItems++;
if (listPtr == null)
  listPtr = newNode;   // first item
else
{
  while (currentPtr != null &&  
         currentPtr.getItem().compareTo(newItem) < 0)
  {
    prevPtr = currentPtr;
    currentPtr = currentPtr.getNext();
	  }

  if (prevPtr == null)          // Insert as first item
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


