// Class TestEnum reads in a letter as a string, and converts
// it to the appropriate LetterGrade. The number of times
// each grade appears is summed, using a switch statement. 
// The tallies are printed, using a switch statement.
import java.io.*;
import java.util.*;
public class TestEnum
{
  enum LetterGrade {A,B,C,D,F}
  public static void main(String[] args) throws IOException
  {   
    Scanner inFile = new Scanner(new FileReader("Enum.dat"));	
    LetterGrade grade;
    String strGrade;    
    int ACount = 0;
    int BCount = 0;
    int CCount = 0;
    int DCount = 0;
    int FCount = 0;
	
    while (inFile.hasNext())
    {
      grade = LetterGrade.valueOf(inFile.nextLine());
      // Add one to tally associated with grade
	switch (/* TO BE FILLED IN: Exercise 1 */)
	{
	  /* TO BE FILLED IN: Exercise 2 */
	}	 	 
    }
    for ( /* TO BE FILLED IN: Exercise 3 */
    // Iterate through each value of LetterGrade
    {
	System.out.print(counter + ": ");
      // Print tally associated with each LetterGrade
	switch (counter)
	{
	  /* TO BE FILLED IN: Exercise 4 */
	}
    }
  }
}

