// Application Text counts the occurrence of all characters 
// in a text file
import java.util.Scanner
import java.io.*;
public class Text
{
  public static void main(String[] args) throws IOException
  {
    int[] charCount;    
    charCount = new int[256];  // Contains character counts
    char[] lineArray;
    
    int index;
    String line;
    Scanner inFile;
    inFile = new Scanner(new FileReader("Text.dat"));

    while (/* TO BE FILLED IN: Exercise 4 */)
    {
      line = inFile.nextLine();
      /* TO BE FILLED IN: Exercise 5 */
    }
    for (index = 0; index < charCount.length; index++)
    {
      /* TO BE FILLED IN: Exercise 6 */
    }
  }
}

