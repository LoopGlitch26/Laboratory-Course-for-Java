public class WriteMoney
{ 
  static ObjectOutputStream outObject; 
  // Output data file  
  public static void main(String[] args) throws IOException
  {
    outObject = new ObjectOutputStream
      (new FileOutputStream("outMoney.dat")); 

    // Create and write two Money objects
    Money someMoney = new Money(222, 33);
    outObject.writeObject(someMoney);
    Money moreMoney = new Money(333, 22);
    outObject.writeObject(moreMoney);
    outObject.close();
  }
}  

