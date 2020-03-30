// Application Typos prints three integer numbers, sums the numbers, calculates
// the average, and prints the sum and the average of the three numbers

public class Typos
{

  public static void main(String[] args)
  {

    final int ONE = 5;
    final int TWO = 6;
    final int THREE = 7;

    int sum;
    float average;

    System.out.println("ONE "  "TWO "  "THREE ");
    sum = ONE + TWO + THREE;
    average = sum % 3
    System.out.println(" The sum is "  + average  + " and the average is "
	  + sum);
  }
}
