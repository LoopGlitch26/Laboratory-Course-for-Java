// Application tests to see if a file is made up of 
// alternating Odd/Even numbers beginning with a even number
import java.util.Scanner;
import java.io.*;
public class FileTest
{
  enum OddEven {ODD, EVEN} 
  public static void main(String[] args) throws IOException
  {
    String fileName;
    Scanner inName = new Scanner(System.in);
	  Scanner inFile;
	  System.out.println("Enter file name");
    fileName = inName.nextLine();
	  inFile = new Scanner(new FileReader(fileName));  
	
	  int fileValue;
	  OddEven current = OddEven.EVEN;
    boolean error = false;
	  while (inFile.hasNextInt() && !error)
	  {
	    fileValue = inFile.nextInt();
	    switch (current)
	    {
	      case EVEN : // fileValue should be even
                    if (fileValue % 2 == 0)
		              current = OddEven.ODD;  // set to odd
				else
			        error = true;
				break;
		case ODD  : // fileValue should be odd
                    if (fileValue % 2 != 0)
		              current = OddEven.EVEN; // set to even
				else
				  error = true;
				break;
	   }
	 }
	 
	 if (!error)
	   System.out.println("File is ok.");
	 else
	   System.out.println("File is defective.");
  }
 }

