// Application Reverse reads numbers into an array 
// and prints them out in reverse order.   
import java.util.Scanner;
import java.io.*;
public class Reverse
{ 
  public static void main(String[] args) throws IOException
  {
    final int MAX = 10;
    Scanner inFile = 
      new Scanner(new FileReader("Reverse.dat"));
    int[]  numbers;
    numbers = new int[MAX];

    int  value;
    int  index;
    for (index = 0; index < numbers.length; index++)
    {
      // FILL IN Code to read value
      // FILL IN Code to store value into numbers
    }
    
    for (index = MAX - 1; index >= 0; index--)
      // FILL IN Code to write numbers on the screen
    inFile.close();
  }
}

