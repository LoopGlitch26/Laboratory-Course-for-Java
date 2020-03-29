public class Book //class name is Book
{
String title; //3 member variables
String author;
String isbnNum;
public Book(String newTitle, String newAuthor, String newISBN) //parameterized constructor setting fields to the values passed in the parenthesis
{
title=newTitle;
author=newAuthor;
isbnNum=newISBN;
}
public Book() //default constructor setting fields to empty string.
{
title="";
author="";
isbnNum="";
}
public String getTitle() //3 value returning methods
{
return title;	
}
public String getAuthor()
{
return author;	
}
public String getISBN()
{
return isbnNum;	
}
}
//PARAMETERS and ARGUMENTS: Parameters are the names of the variables in the heading of a method;
//Arguments are the variables in method call.
//The variables or expressions in method call are substituted for the parameters within the method body in execution.
//Immutable Class is a class in which there is no method defined that changes the values of field.

