//**********************************************************
// Class UseList is a driver for class FloatList.  The list
// is instantiated, values are read in and printed.
//**********************************************************
import java.io.*;	        // Access file classes
import java.util.Scanner;   // Access Scanner
public class UseList
{
  // This class is a driver to execute class FloatList
  public static Scanner inFile;

  public static void main(String[] args) throws IOException
  {
    // Data file for this test is on "real.dat"
    inFile = new Scanner(new FileReader("real.dat"));
    FloatList  list;
    // Instantiate list with 50 cells
    list = new FloatList(50);

    // Input values into list
    list.getList(inFile);
    // Print values on System.out
    list.printList();
    inFile.close();      // Close the input file
  }
}
