// Application Bugs demonstrates various looping structures.
import java.io.*;
import java.util.Scanner;
public class Bugs
{
  public static Scanner inData;

  public static void main(String[] args) throws IOException
  {
    int fileFound;
    try
    {
      inData = new Scanner(new FileReader("Bug.dat"));
      fileFound = 1;
    }
    catch (IOException exception)
    {
       fileFound = 2;  
    }
    int  value;
    switch (fileFound)
    {
      case 2 : System.out.println("Bugs.dat not found");
      case 1 :     
             // do loop
             int  counter = 1;
             int  sum = 0;
             do
             {
               value = inData.nextInt();
               sum = sum + value;
             } while (counter <= 10);
             System.out.println(sum);
             // for loop
             sum = 0;
             for (counter = 1; counter <= 10; counter++)
             {
               value = inData.nextInt();
               sum = sum + value;
               counter++;
             }
            System.out.println(sum);
    }
  }
}

