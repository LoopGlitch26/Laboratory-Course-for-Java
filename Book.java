public class Book
{
  String title;
  String author;
  String isbnNumber;
  public Book(String newTitle, String newAuthor,
              String newISBN)
  {
    title = newTitle;
    author = newAuthor;
    isbnNumber = newISBN;
  }
  public Book()
  {
    title = "";
    author = "";
    isbnNumber = "";
  }
  public String getTitle()
  {
    return title;
  }
  public String getAuthor()
  {
    return author;
  }
  public String getISBN()
  {
    return isbnNumber;
  }
  public String toString()
  {
  	return 
  	    "Title:       " + title + "\n" 
  	  + "Author:      " + author + "\n" 
  	  + "isbn number: " + isbnNumber + "\n"; 
  }
}

