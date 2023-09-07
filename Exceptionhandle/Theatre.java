/*You are tasked with developing a Reservation System program in Java for a theater. The program will allow users to make reservations for seats. The theater has a fixed number of rows and columns of seats, and each seat can be either available or reserved.

Your program should perform the following tasks using custom exceptions:

Create a grid representing the theater with available and reserved seats.
Implement a custom exception called SeatUnavailableException which is thrown when a user tries to reserve an already reserved seat.
Allow users to input the row and column numbers of the seat they want to reserve.
If the seat is unavailable, throw the SeatUnavailableException.
Display the updated theater grid after each reservation.

Write a Java program that implements the above scenario using custom exceptions, arrays, and user input.*/
import java.util.*;
class SeatUnavailableException extends Exception{
  public  SeatUnavailableException(String message){
    super(message);
  }
}
class Booking{
  void resrve(){
    Scanner sc=new Scanner(System.in);
    int rows=50;
    int columns=30;
    int arr[][]= new arr[rows][columns];
    for(int i=0;i<arr.length;i++){
     for(int j=0;j<arr.length;j++){
       System.out.println("Theatregrid is "+arr[i][j]);
     }
    }
    System.out.println("Enter a row number and colum number to resrve a seat" );
    int r=sc.nextInt();
    int c=sc.nextInt();
     arr[i][j]==r
  }
} 