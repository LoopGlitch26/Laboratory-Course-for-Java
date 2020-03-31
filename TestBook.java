// Class TestBook is a driver to test class Book
import java.util.Scanner;
public class TestBook
{
  public static void main(String[] args)
  {
    LibBook first;
    Book second;
    Scanner inData = new Scanner(System.in);
    
    first = new LibBook("How to Solve It",
    		             "G. Polya", 
                        "0-691-02356-5",
                        2, 511);
    second = 
      new Book("Programming and Problem Solving with Java",
    		    "Nell Dale and Chip Weems",
    		    "10: 0-7637-3402-0");
    System.out.println("Book object: " + "\n" + second);
    System.out.println("LibBook object: " + "\n" + first);
  }
}  	
