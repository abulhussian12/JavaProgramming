import java.util.*;

class SetExample {
  public static void main(String a[]) {
    Set hs = new TreeSet();
    hs.add(12);
    hs.add(3);
    hs.add(10);
    hs.add(9);
    Iterator i = hs.iterator();
    while (i.hasNext()) {

      System.out.println(i.next());
    }
  }
}