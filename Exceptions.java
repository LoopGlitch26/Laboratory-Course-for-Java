import java.io.*; 
import java.util.Scanner; 
public class Exceptions
{
  static  Scanner inFile;
  public static void main(String[] args) throws IOException
  {
    int fileTry = 0;
    String fileName;
    Scanner inName = new Scanner(System.in);
    System.out.println("Enter file name");
    fileName = inName.nextLine();
    boolean fileOk;
    do
    {
      fileOk =  false;
      try
	    {
	      // TO BE FILLED IN: Exercise 3
	    }
	    catch(FileNotFoundException error)
	    {
	      // TO BE FILLED IN: Exercise 4
	    }
    } while (!fileOk && fileTry < 4);
    PrintWriter outFile = 
      new PrintWriter(new FileWriter("outData.dat"));
    if ( /* TO BE FILLED IN: Exercise 5 */ )
    {	
      int numDays = 0;
      double average;
	    double inches = 0.0;
	    double total = 0.0;
	    while (inFile.hasNextFloat())
      {
        inches = inFile.nextFloat();
        total = total + inches;
	      outFile.println(inches);
	      numDays++;
      }
    
      if (numDays == 0) 
        System.out.println("Average cannot be computed " +
                         " for 0 days."); 
      else
      {
        average = total / numDays;
        outFile.println("The average rainfall over " +  
          numDays + " days is " + average); 
      }
      inFile.close();
    }
    else
      // TO BE FILLED IN: Exercise 5
    outFile.close();
  }
}

