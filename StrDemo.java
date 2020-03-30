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
    inLine = inData.nextLine();
    // Examples of various string operations

    System.out.println(inLine.length());
    System.out.println(inLine.indexOf("the"));
    System.out.println(inLine.indexOf(CAT));
    System.out.println(inLine.substring(17, 23));
    System.out.println(inLine.substring(17, 17));
    System.out.println(inLine.substring(17, 23).length());
System.out.println("" + inLine.charAt(0) + 
inLine.charAt(1));
System.out.println("How much would you would pay " +
  "for the doggie?");
System.out.println("(in whole dollars please)");
dollars = inData.nextInt();
System.out.println("Would you really pay $" + dollars + 
"?");
System.out.println(("  trim test ").trim());
inData.close();
  }
}

