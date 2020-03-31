// Application CountPunct counts punctuation marks in a file
import java.util.Scanner;
import java.io.*;
public class CountPunct 
{
  public static void main(String[] args) 
    throws FileNotFoundException 
  {
    FileReader file = new FileReader("Punct.dat");
	  Scanner inFile = new Scanner(file);
    String line;
	  char symbol;
    int  periodCt = 0;
    int  commaCt = 0;
    int  questionCt = 0;
    int  colonCt = 0;
    int  semicolonCt = 0;
    int  count;
    while (inFile.hasNextLine()) // Loop til end of data
    {
      line = inFile.nextLine();
      count = 0;
      while (count < line.length())
      { // Loop til end of line
        symbol = line.charAt(count);
		// TO BE FILLED IN: count punctuation marks
        count++;
      }	  
    }   
	 // TO BE FILLED IN: output 
  }
}

