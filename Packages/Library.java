/*You are tasked with creating a Library Management System application that helps manage books, borrowers, and transactions in a library. Implement this system using packages to organize the classes and functionalities.

Requirements:

Create a package named library that contains classes related to the library management system. Implement the following classes in this package: a) Book: Represent a book with attributes like title, author, ISBN, and availability status. b) Borrower: Represent a borrower with attributes like name, ID, and borrowed books. c) Transaction: Represent a transaction with attributes like borrower, book, and due date.
Implement a class named LibraryApp in the default package (no package declaration) with the following functionalities:
Allow the librarian to add new books to the library.
Allow borrowers to check out books. A borrower should not be able to borrow more books than the library has in stock.
Allow borrowers to return books and calculate any late fees.
Display the list of books, borrowers, and transactions.
Demonstrate the use of import statements to use classes from the library package within the LibraryApp class.
Design the classes with appropriate constructors, methods for data manipulation, and error handling (e.g., trying to borrow more books than available).
Bonus (optional): Add a Catalog class within the library package to manage a catalog of book genres, and link books to their genres. Modify the LibraryApp class to allow filtering and displaying books by genre.*/

package Lib{
  class Book{
    
    String bookname,Authorname;
    String ISBNno;
    boolean availabilitystatus=No;
    Book(String bookname,String Authorname){
      ISBNno=123;
      if (ISBNno==123){
        availabilitystatus=yes;
      }
    }
  }
class Borrwer{
 
  Borrwer(String name,String ID){
  }
  public void details(int borrwerdboks){
     String Borrwedbooks[]=new Borrwedbooks[borrwerdbooks];
    for(int i=0;i<borrwerdbooks;i++)
      
  }
  }
}
  
}