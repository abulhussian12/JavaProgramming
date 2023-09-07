/*Create a class named Book with the following attributes:
title (String)
author (String)
availableCopies (int)
Create a custom exception class named OutOfCopiesException that extends Exception. This exception should be thrown when a user tries to reserve a book but there are no available copies.
Create a class named Library which contains a list of Book objects. Implement the following methods:
addBook(Book book) to add a book to the library.
reserveBook(String title) to allow a user to reserve a book. If the book is not available, throw an OutOfCopiesException.
Create a class named User with the following attributes:
name (String)
reservedBooks (List of Book)
In your Main class, demonstrate the functionality of your library reservation system by adding books to the library, allowing users to reserve books, and handling the custom exception.*/

class OutofcopiesException extends Exception{
  public OutofcopiesException(String message){
    super (message);
  }
}
public class Books{
  String titlebook,author;
  int copies;
  public Books (String titlebook,String author,int copies){
    this.titlebook=titlebook;
    this.author=author;
    this.copies=copies;
  }
  
  }
  public class Library extends Books {
  //Library(String addbook,String titlebook){
    String listofbooks[] Books;
     public Library(int noofbooks){
   Books= listofbooks[noofbooks];
    for (int i=0;i<noofbooks;i++)
      listofbooks[i];
      }
    void addbook(String book){
      
    }
   
      
    }
  }
  
}