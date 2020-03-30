// Application Pres demonstrates the precedence of operators

public class Pres
{
  public static void main(String[] args)
  {
    System.out.println(4 + 3 * 5);
    System.out.println((4 + 3) * 5);
    System.out.println(4 * 5 % 3 + 2);
    System.out.println(4 * (5 / 3) + 2);
  }
}
