// Application Convert converts a temperature in Fahrenheit to 
// Celsius and a temperature in Celsius to Fahrenheit
import java.util.Scanner;
public class Convert
{
  public static void main(String[] args) 
  {
    Scanner inData = new Scanner(System.in);

    int fToC;	// Place to store Celsius answer
    int cToF;	// Place to store the Fahrenheit answer 

    System.out.println("Enter a value to be converted " 
      + "from Fahrenheit to Celsius.");
    fToC = Integer.parseInt(inData.nextLine());

    System.out.println(fToC + " in Fahrenheit is "  
      +  (5 * (fToC - 32)/9) + " in Celsius. "); 
  }
}
