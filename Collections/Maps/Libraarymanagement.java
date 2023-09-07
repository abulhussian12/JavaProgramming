import java.util.*;
class Book
{
   String tittle;
   String author;
   int availablecopies;
   public Book(String tittle,String author,int availablecopies)
   {
       this.tittle=tittle;
       this.author=author;
       this.availablecopies=availablecopies;
   }
}
class Main
{
    HashMap<Integer,Book> catalog;
    Main()
    {
     catalog=new HashMap<>();   
    }
    
    void addBook(int bookId,String tittle,String author,int availablecopies)
    
    {
        catalog.put(bookId,new Book(tittle,author,availablecopies));
    }
    
    void borrowBook(int bookId)
    {
        if(catalog.containsKey(bookId))
        {
            Book book=catalog.get(bookId);
            if(book.availablecopies>0)
            {
                book.availablecopies--;
                System.out.println("Borrowed successfully");
            }
        }
        else
        {
          System.out.println("books are not available"); 
        }
    }

    void displaydetails(int bookId)
    {
         if(catalog.containsKey(bookId))
     {
        Book book=catalog.get(bookId);
        System.out.println("Book Id :"+bookId);
        System.out.println("Book Name :"+book.tittle);
        System.out.println("Book author :"+book.author);
        System.out.println("Book copies :"+book.availablecopies);
    }
    else
    {
      System.out.println("Book is not available");  
    }
    
   }
void displayallBooks()
{
    for(int bookId:catalog.keySet())
    {
        displaydetails(bookId);
    }
}
public static void main(String[]args)
{
    Main lib=new Main();
    lib.addBook(1,"Java","Narayan",5);
    lib.addBook(23,"python","Narayan murthy",10);
    lib.addBook(4,"Java advance","murthy",7);
    lib.borrowBook(23);
    lib.displaydetails(5);
    lib.displayallBooks();
}
}