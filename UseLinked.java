import java.util.Scanner;
import java.io.*;
public class UseLinked
{
  public static void main(String[] args) throws IOException
  {
    Scanner inData = new Scanner(new FileReader("Linked.dat"));
    LinkedList list = new LinkedList();
    while (inData.hasNextLine())
    {
    	String newItem = inData.nextLine();    
    	list.insert(newItem);   	
    }	
    list.printList();
  }
}
