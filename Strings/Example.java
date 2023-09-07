import java.util.*;
class Example {
  public static void main(String[] args) {
     Scanner g = new Scanner(System.in);
   System.out.println("Give data for   string");
    String s = new String();
    int count=0;
    s = g.nextLine();
    System.out.println(s);  // displaying entire string
for(int l=0;l<=s.length()-1; l++){
   System.out.println(s.charAt(l));//to print in array
    count++;
}
    String b[]= s.split(" ");
    for(int i=0;i<b.length;i++){
      
      System.out.println(b[i]);
    }
    System.out.println(count);
  }
}
