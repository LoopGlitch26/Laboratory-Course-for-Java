// This interface represents linear distance 

public interface Distance 
{
  public Distance();
  public Distance(int inFeet, int inYards, int inMiles);
  public Distance(int inFeet);
  public int getFeet();
  public int getYards();
  public int getMiles();  
  public Distance add(Distance other);  
  public String toString();
}


