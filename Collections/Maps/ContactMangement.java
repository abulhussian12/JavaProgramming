import java.util.*;
class Contact
{
   String cName;
   ArrayList<String> Mnumber1;
   String Emailadress;
   String category;
   int cId;
   public Contact(int cId,String cName,ArrayList<String> Mnumber1,String Emailadress,String category)
   {
       this.cName=cName;
       this.Mnumber1=Mnumber1;
       this.Emailadress=Emailadress;
       this.category=category;
       this.cId=cId;
      
   }
   public int getcId(){
       return cId;
   }
    public String getcName(){
       return cName;
   }
     public ArrayList<String> getMnumber1(){
       return Mnumber1;
   }
    public String getEmailaddress(){
       return Emailadress;
   }
    public String getcategory(){
       return category;
   }
   @Override
   public String toString(){
       return "CustomerId["+cId+"CustomerName\n"+cName+"mobilenumber\n"+Mnumber1+"Emailadress"+Emailadress+"category"+category+"]";
   }
     
}
class Main
{
    
    HashMap<Integer,Contact>con;
    Main()
    {
     con=new HashMap<>();   
    }
    
    
    void addContact(int cId,String cName,ArrayList<String> Mnumber1,String Emailadress,String category)
    
    {
        con.put(cId,new Contact(cId,cName,Mnumber1,Emailadress,category));
    }
    
    
    void Removecontact(int cId)
    {
        if(con.containsKey(cId))
        {
            Contact contact=con.get(cId);

                con.remove(cId);
                System.out.println("Removed successfully");
            
        }
        else
        {
          System.out.println("Contact is  not available"); 
        }
    }
    
    void Updatecontact(int cId,String cName,ArrayList<String> Mnumber1,String Emailadress,String category)
    
    {
        con.put(cId,new Contact(cId,cName,Mnumber1,Emailadress,category));
    }
    
    

    void displaydetails(int cId)
    {
         if(con.containsKey(cId))
     {
        Contact contact=con.get(cId);
        System.out.println("Contact Id :"+cId);
        System.out.println("Contact Name :"+contact.cName);
        System.out.println("Contact number1:"+contact.Mnumber1);
         System.out.println("Emailadress :"+contact.Emailadress);
        System.out.println("category :"+contact.category);
    }
    
    else
    {
      System.out.println("contact is not found");  
    }
    
   }
  
void displayallContacts()
{
    for(int cId:con.keySet())
    {
        displaydetails(cId);
    }
}
void Contactsbycategory(String category)
{
    
    for(Contact co:con.values()){
        if(co.getcategory().equalsIgnoreCase(category)){
            System.out.println(co);
        }
    }
}
void SearchContact(String cName)
{
    
    for(Contact co:con.values()){
        if(co.getcName().equalsIgnoreCase(cName)){
            System.out.println(co);
        }
    }
}
public static void main(String[]args)
{
    ArrayList<String>cat=new ArrayList<String>();
    cat.add("7702639058");
    cat.add("1233456");
    Main lib=new Main();
    lib.addContact(1,"abul",cat,"abul@123","Family");
    lib.addContact(23,"Murthy",cat,"murthy@321","Friends");
    lib.addContact(4,"Rambabu",cat,"rambabu@231","Friends");
   lib.Removecontact(23);
    lib.displaydetails(5);
    lib.displayallContacts();
    lib.Contactsbycategory("Friends");
    lib.SearchContact("abul");
}
}