// Application ComesFirst reads and prints three words.
// The word that comes first in the alphabet is printed with an
// appropriate message  
// Assumption:  The words are unique                       
import java.util.Scanner;
public class ComesFirst
{
  public int comesFirst(String one, String two, String three)
  {
    String first = " ";
    if (one.compareTo(two) > 0)
	  first = one;
	else
	  first = two;
	if (three.compareTo(first) > 0)
	  first = three;
	return first;
  } 
  public static void main(String[] args)
  {
    Scanner inData = new Scanner(System.in);     
    String word1;
    String word2;
    String word3;
    
    // Prompt for and read in words 
    System.out.println("Enter three words.");
    word1 = inData.nextLine();
    word2 = inData.nextLine();
    word3 = inData.nextLine();
    System.out.println("The test words are " + word1 + ", " +
	                    word2 + ", " + word3);
	System.out.println(comesFirst(word1, word2, word3) 
      + " comes first");
  }
}
