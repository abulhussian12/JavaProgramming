import java.util.Scanner;
public class Series2 {
  public static void main(String p[]) {
    int row,r;
    Scanner a = new Scanner(System.in);
    System.out.println("enetr no of rows to display pattern");
    row = a.nextInt();
    Series2 s = new Series2();
    s.pattern(row);

  }

  void pattern(int row) {
    for (int r = 1; r <= row; r++) {
      for (int i = 1; i <= row-r; r++) {
        System.out.print(" " + " ");
        for(int j=row-r+1;j<=row;j++){
          System.out.println(""+"*");
        } 
        } 
      
    }
  }
}
     
    
