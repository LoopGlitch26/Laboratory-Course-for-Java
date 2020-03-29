//Class TextBook is a driver to test class Book
import java.util.Scanner;
public class TextBook
{
	public static void main(String[] args)
	{
		String title;
		String author;
		String isbn;
		Book first=new Book();
		System.out.println("Result of default constructor");
		System.out.println("First is "+first.getTitle()+" by "+first.getAuthor()+" ISBN No: "+first.getISBN());
		Book second;
		Scanner inData = new Scanner(System.in);
		System.out.println("Enter the book title ");
		title=inData.nextLine();
		System.out.println("Enter the author's name ");
		author=inData.nextLine();
		System.out.println("Enter the isbn number ");
		isbn=inData.nextLine();
		second = new Book(title, author, isbn);
		System.out.println("Result of parameterized constructor");
		System.out.println("Second is "+second.getTitle()+" by "+second.getAuthor()+" ISBN No: "+second.getISBN());
	}
}