public class Money 
{
  private long dollars;
  private long cents;
  
  Money()
  {
    dollars = 0;
    cents = 0;
  }

  public Money(long newDollars, long newCents)
  // Constructor: Initializes dollars and cents
  { 
    dollars = newDollars;
    cents = newCents;
  }

  public long  getDollars()		
  // Returns dollars
  {
    return dollars;
  }

  public long getCents()		
  // Returns cents
  {
    return cents;
  }
 
  public String toString()
  // Returns a formatted string for printing
  {
    return "$" + dollars + '.' + cents;
  } 

  public Money  add(Money  value)
  // Returns sum of object plus value.
  {
    Money  result = new Money();
    result.cents = cents + value.cents;
    result.dollars = dollars + value.dollars;
    return result;
  }
}

