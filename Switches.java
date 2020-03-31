// Application Switches demonstrates the use of the Switch 
// statement.

import java.util.Scanner;
public class Switches
{
  public static void main(String[] args)
  {
    char code;
    int answer;
    int one;
    int two;
	String inputString;
	boolean quit = false;
	
	Scanner inLine = new Scanner(System.in);
	do 
	{
	  inputString = inLine.nextLine();
	  code = inputString.charAt(0);
	  if (code != 'Q')
	  {
	    inputString = inputString.substring(1, inputString.length());
	    Scanner string = new Scanner(inputString);
	    one = string.nextInt();
	    two = string.nextInt();
		switch (code)
        {
          case 'A' : answer = (one + two);
                     System.out.println(one  + " + "  + two
                       + " is "  + answer);
                     break;
          case 'S' : answer = (one - two);
		             System.out.println(one  + " - "  + two
		  	         + " is " + answer);
		             break;
		  case 'M' : answer = (one * two);
					 System.out.println(one  + " * "  + two
		  	         + " is " + answer);
					 break;
		  case 'D' : answer = (one / two);
		             System.out.println(one  + " / "  + two
		  	         + " is " + answer);
					 break;
        }
      }
	  else
	    quit = true;
	} while (!quit);
  }
}
