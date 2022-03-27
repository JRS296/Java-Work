import java.io.*;
class Detail //superclass
{
    String name, address;
    long telno;
    double rent;

    Detail(String n1, String a1, long t1, double r1)
    {
        name = n1;
        address = a1;
        telno = t1;
        rent = r1;
    }

    void show()
    {
        System.out.println(“Name of customer = “+name);
        System.out.println(“Address = “+address);
        System.out.println(“Telephone Number = “+telno);
        System.out.println(“Monthly Rental = Rs. “+rent);
    }
} //end of superclass Detail

class Bill extends Detail //subclass
{
    int n;
    double amt;

    Bill(String n1, String a1, long t1, double r1, int c)
    {
        super(n1,a1,t1,r1); //initializing data members of superclass by calling its constructor
        n = c;
        amt = 0.0;
    }

