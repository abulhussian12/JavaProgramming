class RealEstate
{
    void filter(long price) // oveloading method
    {
        System.out.println("disply all house whose price is lessthan "+price);
    }
    void filter(double area)  // oveloading method
    {
        System.out.println("disply all house whose ares is equal to "+area);

    }
    void filter(String location) // oveloading method
    {
        System.out.println("disply all house located in location "+location);
    }

 

}

 

class Staticpoly
{
    public static void main(String q[])
    {
        RealEstate  rs=new RealEstate();
        rs.filter(4500000);
        rs.filter("Hyderabad");
        rs.filter(1500.700);

    }

}