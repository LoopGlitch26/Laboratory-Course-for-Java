
public class LibBook extends Book
{
  int copyNumber;
  float ddcNumber;
  public LibBook()
  {
    super();
    copyNumber = 1;
    ddcNumber = 0;
  }
  public LibBook(String newTitle, String newAuthor, 
                 String newISBN, int copy, float DDC)
  {
    super(newTitle, newAuthor, newISBN);
    copyNumber = copy;
    ddcNumber = DDC;
  }
  public int getCopy()
  {
    return copyNumber;
  }
  public float getDDC()
  {
    return ddcNumber;
  }
  public String toString()
  {
  	return
  	  super.toString()
  	  + "Copy number: " + copyNumber + "\n"
  	  + "DDC number:  " + ddcNumber + "\n";
  }
}
