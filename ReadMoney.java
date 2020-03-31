// Application ReadMoney reads in Money objects 
import java.io.*;
import money.Money;
public class ReadMoney 
{
  static ObjectInputStream inObject;       
  //Input file  
  public static void main(String[] args) 
    throws IOException, ClassNotFoundException
  {    
    Money someMoney;
    inObject = new ObjectInputStream
      (new FileInputStream("outMoney.dat"));
    
    //Read and print two Money objects
    someMoney = (Money)inObject.readObject(); 
    System.out.println("Dollars: " + someMoney.dollarsAre() +
      " Cents: " + someMoney.centsAre());
    someMoney = (Money)inObject.readObject(); 
    System.out.println("Dollars: " + someMoney.dollarsAre() +
      " Cents: " + someMoney.centsAre());
    inObject.close();   
  }
}


