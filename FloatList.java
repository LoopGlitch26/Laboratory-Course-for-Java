//************************************************************
// Class FloatList creates a list of floating point values.
// The methods that manipulate the list are getList, which
// inputs the values, and printList, which prints the list
// values on the screen.
//************************************************************
import java.io.*;         // Access file classes
public class FloatList
{ 
  // Methods
  public void getList(BufferedReader inFile) throws IOException
  {
    // Reads values from a file and stores them into the list
    // File exceptions not caught

    String data;
    data  = inFile.readLine();  // Data value in string form
    while (data != null)
    {
      // End of file used to control loop
      values[numItems] = Float.parseFloat(data);
      numItems++;
      data = inFile.readLine();
    }             
  }                                                            

  public void printList()
  {
    // Prints values one per line on System.out
    // Only valid data values are printed
    int  index;

    for (index = 0; index < numItems; index++)
      System.out.println(values[index]);
  }

  public FloatList(int maxItems)
  {
    // Constructor
    // list is instantiated with maxItem cells
    numItems = 0;
    values = new float[maxItems];
  }

  // Private data
  private int numItems;    // Number of valid data values
  private float[] values;  // List of floating-point values
}

