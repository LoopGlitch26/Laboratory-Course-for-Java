public class Distance
{
  int feet;
  int yards;
  int miles;
  // Constructors
  public Distance()
  { 
    feet = 0; 
	yards = 0; 
	miles = 0; 
  }
  public Distance(int inFeet, int inYards, int inMiles)
  { 
	feet = inFeet; 
	yards = inYards + feet / 3;  
	feet = feet % 3;
	miles = inMiles; 
	miles = miles + yards / 1760;
	yards = yards % 1760; 
  }

  public int getFeet() { return feet; }
  public int getYards() { return yards; }
  public int getMiles() { return miles; }
  
  public Distance add(Distance other)
  {
    Distance result = new Distance();
	result.feet = feet + other.feet;
	result.yards = yards + other.yards;
	result.miles = miles + other.miles;
	result.yards = result.yards + result.feet / 3;
	result.feet = result.feet % 3;
	result.miles = result.miles + result.yards / 1760;
	result.yards = result.yards % 1760;
	return result;
  }
  
  public String toString()
  {
    return "" + feet + " feet, " + yards + " yards, and " + miles + " 
miles";
  }
}
