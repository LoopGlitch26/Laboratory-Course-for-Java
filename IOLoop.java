// Application IOLoop counts the number of blanks per line
// and the number of lines in a file
import java.io.*;
import java.util.Scanner;
public class IOLoop
{
  public static Scanner inFile;
  public static PrintWriter outFile;
  public static void main(String[] args) throws IOException
  {
    int lineCount = 0;
    int blankCount;
    int index;
    String inputString;
    inFile = new Scanner(new FileReader("history.dat"));
    outFile = new PrintWriter(new FileWriter("data.out"));
	while (inFile.hasNextLine())
    {
	 inputString = inFile.nextLine();
      lineCount++;
      blankCount = 0;
      index = inputString.indexOf(' ');
      while (index != -1)
      {
        blankCount++;
        if (inputString.length() != 1)
        {
          inputString = inputString.substring(index+1, 
            inputString.length());
          index = inputString.indexOf(' ');
        } 
        else index = -1; 
      }
      outFile.println("Line " + lineCount + " contains "
        + blankCount + " blanks.");
    }
    outFile.close();
    inFile.close();
  }
}
