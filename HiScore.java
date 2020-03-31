// Application HiScore reads and prints three test scores.
// The largest value of the three is printed with an
// appropriate message  
// Assumption:  The scores are unique                       
import java.util.Scanner;
public class HiScore
{
  static int largest(int one, int two, int three)
  {
    int highest = 0;
    if (one > two)
	  highest = one;
	else
	  highest = two;
    if (three > highest)
	  highest = three;
	return highest;
  } 
  public static void main(String[] args)
  {
    Scanner inData = new Scanner(System.in);     
    int score1;
    int score2;
    int score3;
    
    // Prompt for and read in scores 
    System.out.println("Enter three test scores.");
    score1 = inData.nextInt();
    score2 = inData.nextInt();
    score3 = inData.nextInt();
    
    System.out.println("The test scores are " + score1 + ", " +
	                    score2 + ", " + score3);
	System.out.println("The highest is " + largest(score1, score2,
												   score3));

  }
}

