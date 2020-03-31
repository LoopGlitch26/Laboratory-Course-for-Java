import java.util.Scanner;
import java.io.*;
public class Arithmetic
{
	enum Operator {ADD, SUB, MULT, DIV, QUIT}
  public static void main(String[] args) throws IOException
  { 	
    Operator code;
	  Scanner inFile = 
      new Scanner(new FileReader("Arith.dat"));
	  int one, two, answer;
	  boolean quit = false;
	  while (inFile.hasNextLine() && !quit)
	  {
	    code = Operator.valueOf(inFile.next());
      one = inFile.nextInt();
      two = inFile.nextInt();
      
	    switch (code)
      {
        case ADD : answer = (one + two);
                   System.out.println(one  + " + "  + two
                     + " is "  + answer);
                   break;
        case SUB : answer = (one - two);
		         System.out.println(one  + " - "  + two
		  	     + " is " + answer);
		         break;
	    case MULT: answer = (one * two);
			   System.out.println(one  + " * "  + two
		  	     + " is " + answer);
		         break;
	    case DIV : answer = (one / two);
		         System.out.println(one  + " / "  + two
		  	     + " is " + answer);
		         break;
         case QUIT: quit = true;
		         break;
      }
	}
  }
}

