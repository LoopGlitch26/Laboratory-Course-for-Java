// Application Mixed demonstrates more on precedence of 
// operators and what happens in mixed-mode  arithmetic
public class Mixed {   public static void main(String[] args)
  {  
    float  fltValue;
    fltValue = (float)3.14159;
    
    int intValue;
    intValue = 5;

    System.out.println("" + intValue / intValue);    
    System.out.println("" + (float) intValue / intValue);
    intValue++;
    System.out.println("" + intValue % 4);
    System.out.println("" + intValue);
    System.out.println("" + 2066 % 1066);
    System.out.println("" + 2066.0 % 1066.0);
    System.out.println("" + 2066 / intValue);

    System.out.println("" + fltValue / intValue);
    intValue = (int)(fltValue + intValue);
    System.out.println("" + intValue);
    fltValue = (float) intValue;
    System.out.println("" + fltValue / intValue);
    System.out.println("" + fltValue/ (float)intValue );
  }
}

