// This class represents linear distance
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
	  yards = inYards;  
	  miles = inMiles; 
  }

  public int getFeet() { return feet; }
  public int getYards() { return yards; }
  public int getMiles() { return miles; }
}

