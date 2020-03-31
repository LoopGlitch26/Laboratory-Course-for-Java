import java.util.Scanner;
import java.io.*;
public class ListDriver 
{
  public static void main(String[] args) throws IOException 
  {
    Scanner inFile = new Scanner(new FileReader("int.dat"));
    List list = new List(20);
	 
    while (inFile.hasNextInt())
	list.store(inFile.nextInt());
    list.printList();
	 
  }
}
