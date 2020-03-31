// Application Arrays manipulates values in an array.             

public class Arrays
{
  public static void main(String[] args)
  {
    final int MAX_ARRAY = 5;                                                       
    int[]  numbers; 
    numbers = new int[MAX_ARRAY];     
    int  index;
    int  sum;

    // Stored values in the array. 
    for (index = 0; index < numbers.length; index++)
      numbers[index] = index * index;                        

    // The values in the array are summed. 
    sum = 0; 
    for (index = 0; index < MAX_ARRAY; index++)
      sum = sum + numbers[index];
    System.out.println("Sum is "  + sum);
  } 
}                                                

