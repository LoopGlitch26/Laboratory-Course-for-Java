// Class Trip is designed to record information
// about a trip
public class Trip 
{
  String toDestination;
  String fromDestination;
  Distance howFar;
  Date whenGoing;
  Date whenReturning;
  public Trip()
  {
    toDestination = "";
    fromDestination = "";
    howFar = new Distance();
    whenGoing = new Date(0,0,0);
    whenReturning = new Date(0,0,0);
  }
  public Trip(String to, String from, Distance dist,
		       Date going, Date returning)
  {
    toDestination = to;
    fromDestination = from;
    howFar = dist;
    whenGoing = going;
    whenReturning = returning;
  }
  
  public String toString()
  {
    return
	  "Destination: " + toDestination + "\n" +
	  "Beginning:   " + fromDestination + "\n" +
	  "Distance:    " + howFar.getMiles() + "\n" +
	  "Going:       " + whenGoing.toString() + "\n" +
	  "Returning:   " + whenReturning.toString();
  }	
}

