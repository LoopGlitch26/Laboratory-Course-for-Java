// Application Miles prints miles in kilometers
public class Miles
{
  // Value-returning method
  public static double kilometers(int miles)
  {
    final double KILOMETERS_PER_MILE = 1.609;
    return KILOMETERS_PER_MILE * (double)miles;
  }

  public static void main(String[] args)
  {   
    System.out.println("One mile is " + kilometers(1)  
      + " kilometers.");
    System.out.println("Ten miles is " + kilometers(10)
      + " kilometers.");
    System.out.println("One hundred miles is " 
      + kilometers(100) + " kilometers.");
  }
}

