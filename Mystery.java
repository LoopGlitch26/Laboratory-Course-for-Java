package mystery;
import java.util.Scanner;
import java.io.*;
public class Mystery
{
  public Mystery(int rows, int cols)
  {
    table = new int[rows][cols];
  }

  public void  getMystery(Scanner inFile) 
    throws IOException
  // Reads values from inFile and stores them in the table;
  // rowsUsed and colsUsed are the first values on the file; 
  // values follow by row, one value per line             
  {

    colsUsed = inFile.nextInt();
    rowsUsed = inFile.nextInt();
   
    for (int row = 0; row < rowsUsed; row++)
      for (int col = 0; col < colsUsed-1; col++)
        table[row][col] = inFile.nextInt();
  }

  public void  printMystery()
  // Writes values in the table on System.out
  {
    for (int row = 0; row < rowsUsed; row++)
    {
      for (int col = 0; col < colsUsed; col++)
        System.out.print(table[row][ col] + " ");
      System.out.println();
    }
  }

  // Data fields
  int rowsUsed;
  int colsUsed;
  int[][] table;
  
}

