// Program SumNums reads and counts nonnegative integers until
// the end of file is reached on file SumNums.D1
import java.io.*;
import java.util.Scanner;
public class SumNums
{
  public static Scanner inFile;
  public static void main(String[] args) throws IOException
  {
    inFile = new Scanner(new FileReader("SumNum.d1"));
    
    int  number;	      // input value
    int  count;		 // number of positive values
    number = inFile.nextInt();
    count = 0;
    while (number != 0)
    {
	  number = inFile.nextInt();
      if (number > 0)
	    count = count + number;
    }
    System.out.println("The number of nonnegative integers is " 
      + count);
  }  
}

