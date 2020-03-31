import java.util.*;
import java.io.*;
public class ColExample
{
	public static void main(String[] args) throws IOException 
	{
	  Scanner inFile = new Scanner(new FileReader("list.dat"));
	  ArrayList<String> list = new ArrayList<String>(4);    
	  System.out.println("List is empty " + list.isEmpty());
	  while (inFile.hasNext())
	    list.add(inFile.nextLine());
	  Iterator iter  = list.iterator();
	  while (iter.hasNext())
	    System.out.println(iter.next());	  
	  System.out.println("List is empty " + list.isEmpty());
	  System.out.println("Length is " + list.size());
	}
}

