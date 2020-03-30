// Class TestMoney is a driver to test class Money
public class TestMoney
{
  public static void main(String[] args)
  {
    Money myMoney = new Money();
	  System.out.println(myMoney.getDollars() + " dollars " 
      + mMoney.getCents() + " cents");
    System.out.println(myMoney);
    Money yourMoney = new Money(33, 44);
	  System.out.println(yourMoney.getDollars() + " dollars " 
      + yourMoney.getCents() + " cents");
    System.out.println(yourMoney);
	  Money otherMoney = new Money(4, 66);
	  Money answer = new Money();
	  Money ourMoney = new Money();
	  ourMoney = myMoney.add(yourMoney);
	  System.out.println(myMoney + " + " + yourMoney 
      + " = " + ourMoney);
	  answer = yourMoney.add(otherMoney);	
	  System.out.println(yourMoney + " + " + otherMoney 
      + " = " + answer);
  }
}

