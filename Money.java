package money;
import java.io.*;
public class Money implements Serializable
{
  private long dollars;
  private long cents;
  
  Money()   // Default Constructor
  {
    dollars = 0;
    cents = 0;
  }

  public Money(long newDollars, long newCents)  // Constructor: Initializes dollars and cents
  { 
    dollars = newDollars;
    cents = newCents;
  }

  public long  getDollars()		 // Returns dollars
  {
    return dollars;
  }

  public long getCents()	  // Returns cents
  {
    return cents;
  }
 
  public String toString()   // Returns a formatted string for printing
  {
    return "$" + dollars + '.' + cents;
  } 

 public Money  add(Money  value)   // Returns a Money object that is the result of adding two Money objects
{
  Money  result = new Money();
  result.cents = cents + value.cents;
  result.dollars = dollars + value.dollars 
    + result.cents / 100;
  result.cents =  result.cents MOD 100;
  return result;
  }
}


