import java.util.Scanner;
import java.io.*;
public class UseTable
{
  public static void main(String[] args) throws IOException
  {
    TwoDTable  table;
    table = new TwoDTable(10, 8);

    Scanner inFile = new Scanner(
      new FileReader("twod.dat"));

    table.getTable(inFile);
    table.printTable();
    inFile.close();
  }
}


