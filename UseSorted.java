import java.util.Scanner;
import java.io.*;
public class UseSorted 
{
  public static void main(String[] args) throws IOException
  {
    Scanner inData = 
      new Scanner(new FileReader("Linked.dat"));
    LinkedSorted list = new LinkedSorted();
    while (inData.hasNextLine())
    {
      String newItem = inData.nextLine();
  	list.insert(newItem);   	
    }	
    list.print();
  }
}

