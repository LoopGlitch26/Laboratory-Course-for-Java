// Application StrDemo demonstrates string methods.
import java.util.Scanner;
public class StrDemo
{
  public static void main(String[] args)
  {
    Scanner inData;    //Input stream for strings
    inData = new Scanner(System.in);
    int dollars;
    String inLine;
    final String CAT = "cat";

    System.out.println("Enter a string.");
    inLine = inData.nextLine(); // suppose that the input is "How much is that doggie in the window?"
    // Examples of various string operations

    System.out.println(inLine.length()); // total number of characters in the string, starts with 1
    System.out.println(inLine.indexOf("the")); // counting starts from 0, so t in the is at 27th position
    System.out.println(inLine.indexOf(CAT)); // as the string or character does'nt occur in the string object, so output is -1
    System.out.println(inLine.substring(17, 23)); //starts with 0
    System.out.println(inLine.substring(17, 17)); // empty string is output
    System.out.println(inLine.substring(17, 23).length()); // a method can be applied to result of another method, output 6
System.out.println("" + inLine.charAt(0) + inLine.charAt(1)); // character at the position specified, output Ho, i.e starts from 1 like length()
System.out.println("How much would you would pay " + "for the doggie?");
System.out.println("(in whole dollars please)");
dollars = inData.nextInt();
System.out.println("Would you really pay $" + dollars + "?");
System.out.println(("  trim test ").trim()); // trim() removes the blanks on both sides
inData.close();
  }
}

