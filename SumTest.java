// Application SumTest reads and sums a file recursively
import java.io.*;
import java.util.Scanner;
public class SumTest
{
  static Scanner inFile;
  static int sum(Scanner inFile) throws IOException
  {
    if (inFile.hasNextInt())
      return  inFile.nextInt() + sum(inFile); 
    
  }
  public static void main(String[] args) throws IOException
  {
    inFile = new Scanner(new FileReader("int.dat"));
    System.out.println(sum());
  }
}

