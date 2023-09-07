class Numberword {
  public static void main(String j[]) {
    int number;// 111
    System.out.println("enter any number");
    Scanner s = new Scanner(System.in);
    number = s.nextInt();
    NumberWord nw = new NumberWord();

    nw.displayNumber(number); // displayNumber(111);
  }

 

  void displayNumber(int number)// number ----> 111
  {
    String str = "";
    while (number > 0) {
      int digit = number % 10;
      number = number / 10;
      switch (digit) // digit--> 0 to 9
      {
        case 0:
          str = "Zero" + str;
          break;
        case 1:
          str = "One" + str;
          break;
        case 2:
          str = "Two" + str;
          break;
        case 3:
          System.out.print("Three");
          break;
        case 4:
          str = "Four" + str;
          break;
        case 5:
          str = "Five" + str;
          break;
        case 6:
          str = "Six" + str;
          break;
        case 7:
          str = "Seven" + str;
          break;
        case 8:
          str = "Eight" + str;
          break;
        case 9:
          str = "Nine" + str;
          break;

 

      }
    }
    System.out.println(str);
  }
}