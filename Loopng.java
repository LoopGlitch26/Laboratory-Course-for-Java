// Application Looping uses a count-controlled loop to read 
// and sum 10 integer values and an event-controlled loop to 
// read and sum values until a negative value is found.  
import java.io.*;
import java.util.Scanner;
public class Looping
{
  public static Scanner inData;
  public static void main(String[] args) throws IOException
  {
    inData = new Scanner(new FileReader("Looping.dat"));    
	  int  value;    
	  int  counter;
    int  sum;

    counter = 1;
    sum = 0;
    while (counter <= 10)
    {// Ten values read and summed
      value = inData.nextInt();       
	    sum = sum + value;
      counter++;
    }
    System.out.println("The first sum is "  + sum);
    
    value = inData.nextInt();
    sum = 0;
    while (value >= 0)
    {// Values are read and summed until a negative is read
      sum = sum + value;
      value = inData.nextInt();
    }
    System.out.println("The second sum is "  + sum);
  } 
}  

