import java.io.*;
import java.util.Scanner;
public class TwoDTable
{
  public TwoDTable(int rows, int cols)
  {
    table = new int[rows][cols];
  }

  public void  getTable(Scanner inFile) 
    throws IOException
  // Reads values from inFile and stores them in the table;
  //  rowsUsed and colsUsed are the first values on the file; 
  //  values follow by row, one value per line             
  {
    /* TO BE FILLED IN: Exercise 1 */
  }

  public void  printTable()
  // Writes values in the table on System.out
  {
    /* TO BE FILLED IN: Exercise 1 */
  }

  // Data fields
  int rowsUsed;
  int colsUsed;
  int[][] table;
}

